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
    public void reorderList(ListNode head) 
    {
        if(head==null||head.next==null)
        {
            return;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=head;
        Stack<Integer> s=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        while(fast!=null&&fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=head;
        while(curr!=slow)
        {
            q.add(curr.val);
            curr=curr.next;
        }
        while(slow!=null)
        {
            s.add(slow.val);
            slow=slow.next;
        }
        // System.out.println(s);
        // System.out.println(q);
        curr=head;
        while(!s.isEmpty()||!q.isEmpty())
        {
            if(!q.isEmpty())
            {
                curr.val=q.poll();
                curr=curr.next;
            }
            if(!s.isEmpty())
            {
                curr.val=s.pop();
                curr=curr.next;
            }
        }
        
        
    }
    
}