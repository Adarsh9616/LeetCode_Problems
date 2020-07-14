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
    public boolean isPalindrome(ListNode head) 
    {
        if(head==null) return true;
        int l=0;
        ListNode cur=head;
        Stack<Integer> s=new Stack<>();
        while(cur!=null)
        {
            s.push(cur.val);
            l++;
            cur=cur.next;
        }
        int i=0;
        cur=head;
        while(i<=l/2)
        {
            if(s.pop()!=cur.val)
            {
                return false;
            }
            cur=cur.next;
            i++;
        }
        return true;
        
        
    }
}