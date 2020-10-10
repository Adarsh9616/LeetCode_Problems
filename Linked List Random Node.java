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

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    int size=0;
    ListNode temp1;
    ListNode temp2;
    Random r;
    public Solution(ListNode head) 
    {
        r=new Random();
        temp1=head;
        while(head.next!=null)
        {
            head=head.next;
            size++;
        }
        size++;
        head.next=temp1;
    }
    
    /** Returns a random node's value. */
    public int getRandom() 
    {
        int n=r.nextInt(size);
        while(n-->0)
        {
            temp1=temp1.next;
        }
        return temp1.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */