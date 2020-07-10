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
        ListNode cur=head;
        solve(cur);
        return head;
        
    }
    public void solve(ListNode c1)
    {
        if(c1==null||c1.next==null)
        {
            return;
        }
        int temp=c1.val;
        c1.val=c1.next.val;
        c1.next.val=temp;
        solve(c1.next.next);
        
    }
}