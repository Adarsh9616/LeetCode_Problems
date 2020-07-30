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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        int carry=0;
        ListNode ans=new ListNode(0);
        ListNode cur1=l1;
        ListNode cur2=l2;
        ListNode a=ans;
        while(cur1!=null||cur2!=null)
        {
            int sum=carry;
            if(cur1!=null)
            {
                sum+=cur1.val;
            }
            if(cur2!=null)
            {
                sum+=cur2.val;
            }
            carry=sum/10;
            ListNode temp=new ListNode(sum%10);
            ans.next=temp;
            ans=ans.next;
            if(cur1!=null)cur1=cur1.next;
            if(cur2!=null)cur2=cur2.next;
        }
        if(carry>0)
        {
            ListNode temp=new ListNode(carry);
            ans.next=temp;
            ans=ans.next;
        }
        return a.next;
    }
}