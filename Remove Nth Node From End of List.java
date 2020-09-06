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
    int k;
    int temp=0;
    ListNode next;
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        k=n;
        ListNode cur=head;
        remove(cur);
        //System.out.println(temp+" "+k);
        if(temp==k)
        {
            return head.next;
        }
        return head;
    }
    public void remove(ListNode cur)
    {
        if(cur==null)
        {
            return ;
        }
        remove(cur.next);
        temp++;
        if(temp==k)
        {
            next=cur.next;
        }
        else if(temp==k+1)
        {
            cur.next=next;
            return;
        }
    }
}