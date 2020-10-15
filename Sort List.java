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
    public ListNode sortList(ListNode head) 
    {
        return mergeSort(head);
    }
    public ListNode mergeSort(ListNode head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        
        ListNode mid=getMid(head);
        ListNode midNext=mid.next;
        mid.next=null;
        ListNode left=mergeSort(head);
        ListNode right=mergeSort(midNext);
        
        ListNode ans=merge(left,right);
        return ans;
    }
    public ListNode merge(ListNode l,ListNode r)
    {
        if(l==null)
        {
            return r;
        }
        if(r==null)
        {
            return l;
        }
        ListNode k=null;
        if(l.val<=r.val)
        {
            k=l;
            k.next=merge(l.next,r);
        }
        else 
        {
            k=r;
            k.next=merge(l,r.next);
        }
        return k;
    }
    public ListNode getMid(ListNode head)
    {
        if(head==null)
        {
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next != null && fast.next.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}