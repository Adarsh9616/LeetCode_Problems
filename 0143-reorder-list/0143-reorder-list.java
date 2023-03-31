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
    ListNode start;
    int totalCount=-1;
    public void reorderList(ListNode head)
    {
        start=head;
        solve(head,1);
    }
    public void solve(ListNode last, int k)
    {
        if(last==null)
        {
            totalCount=k;
            return;
        }
        solve(last.next,k+1);
        if(totalCount!=-1)
        {
            if(k>totalCount/2)
            {

                ListNode temp=start.next;
                start.next=last;
                last.next=temp;
                start=temp;
            }
            else
            {
                start.next=null;
                return;
            }
        }
    }
}