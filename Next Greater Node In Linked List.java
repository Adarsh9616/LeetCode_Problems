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
    public int[] nextLargerNodes(ListNode head) 
    {
        if(head == null) {
            return null;
        }
        
        List<Integer> l = new ArrayList<>();
        while(head != null) {
            l.add(head.val);
            head = head.next;
        }
        
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[l.size()];
        s.push(0);
        for(int i=1;i<l.size();i++)
        {
            int value=l.get(i);
            if(s.isEmpty()||value<=l.get(s.peek()))
            {
                s.push(i);
            }
            else
            {
                while(!s.isEmpty()&&value>l.get(s.peek()))
                {
                    ans[s.pop()]=value;
                }
            }
            s.push(i);
        }
        return ans;
    }
}