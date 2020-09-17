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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        ListNode head=new ListNode(0);
        ListNode ans=head;
        PriorityQueue<ListNode> q=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode l:lists)
        {
            if(l!=null)
                q.add(l);
        }
        while(!q.isEmpty())
        {
            ans.next=q.poll();
            ans=ans.next;
            ListNode temp=ans.next;
            if(temp!=null)
            {
                q.add(temp);
            }
        }
        return head.next;
    }
}