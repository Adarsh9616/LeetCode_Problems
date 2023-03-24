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
    public ListNode swapPairs(ListNode head) 
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode ans=new ListNode(0);
        ans.next=head;
        ListNode curr=ans;
        while(curr.next!=null&&curr.next.next!=null)
        {
            ListNode a=curr.next;
            ListNode b=curr.next.next;
            a.next=b.next;
            b.next=curr.next;
            curr.next=b;
            curr=a;
        }
        return ans.next;
    }
}