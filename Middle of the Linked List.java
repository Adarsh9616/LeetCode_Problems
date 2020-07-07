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
// CheckThisOut
// 
// ListNode slow = head;
//         ListNode fast = head;
//         while(fast != null && fast.next != null){
//             fast = fast.next.next;
//             slow = slow.next;
//         }
//         return slow;
class Solution {
    public ListNode middleNode(ListNode head) 
    {
        ListNode cur=head;
        int l=0;
        while(cur!=null)
        {
            l++;
            cur=cur.next;
        }
        if((l&1)==0)
        {
            l=l/2;
        }
        else
        {
            l=l/2;
        }
        cur=head;
        int i=0;
        while(i<l)
        {
            i++;
            cur=cur.next;
        }
        return cur;
        
    }
}