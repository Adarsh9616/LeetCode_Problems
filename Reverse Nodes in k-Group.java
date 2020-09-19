/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k)
    {
        if(head==null)
        {
            return head;
        }
        int i=0;
        ListNode temp= reverse(head,k);
        ListNode curr=temp;
        while(curr!=null&&curr.next!=null)
        {
            if((i+1)%k==0)
            {
                curr.next=reverse(curr.next,k);
            }
            i++;
            curr=curr.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode head,int k)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode check=head;
        int i=0;
        while(check!=null)
        {
            i++;
            check=check.next;
            if(i>=k)
            {
                break;
            }
        }
        if(i<k)
        {
            return head;
        }
        ListNode curr=null;
        ListNode temp=head;
        ListNode end=curr;
        int c=k;
        while(temp!=null&&k>0)
        {
            ListNode t=temp.next;
            temp.next=curr;
            curr=temp;
            if(k==c)
            {
                end=curr;
            }
            temp=t;k--;
        }
        end.next=temp;
        return curr;
    }
}