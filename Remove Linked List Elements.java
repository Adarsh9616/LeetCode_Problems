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
    public ListNode removeElements(ListNode head, int val)
    {
        ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode first = head;
		ListNode second = dummy;
		while(first != null) {
			if (first.val == val) {
				first = first.next;
				second.next = first;
			} else {
				first = first.next;
				second = second.next;
			}
		}
		return dummy.next;
    }
}