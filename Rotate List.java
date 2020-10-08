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
class Solution 
{
    public ListNode reverse(ListNode head,int k)
    {
        if(head==null)
        {
            return null;
        }
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=head;
        while(curr!=null&&k>0)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            k--;
        }
        head.next=next;
        return prev;
    }
    public int count(ListNode head)
    {
        int i=0;
        while(head!=null)
        {
            head=head.next;
            i++;
        }
        return i;
    }
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head==null||k==0)
        {
            return head;
        }
        int count=count(head);
        k=k%count;
        if(k==0)
        {
            return head;
        }
        ListNode temp=reverse(head,count-k);
        temp=reverse(temp,count);
        temp=reverse(temp,k);
        return temp;
        
    }
}