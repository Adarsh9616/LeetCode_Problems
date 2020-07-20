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
    public ListNode[] splitListToParts(ListNode root, int k) 
    {
        ListNode cur=root;
        int n=0;
        while(cur!=null)
        {
            n++;
            cur=cur.next;
        }
        int width=n/k;
        int rem=n%k;
        cur=root;
        ListNode[] ans=new ListNode[k];
        for(int i=0;i<k;i++)
        {
            ListNode l=new ListNode(0),c=l;
            for(int j=0;j<width+(i<rem?1:0);j++)
            {
                c=c.next=new ListNode(cur.val);
                if(cur!=null)cur=cur.next;
            }
            ans[i]=l.next;
        }
        return ans;
    }
}