/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) 
    {
        if(head==null)
        {
            return null;
        }
        Node cur=head;
        while(cur!=null)
        {
            if(cur.child!=null)
            {
                Node n=cur.child;
                Node m=n;
                while(m.next!=null)
                {
                    m=m.next;
                }
                Node temp=cur.next;
                m.next=temp;
                cur.next=n;
                n.prev=cur;
                if(m.next!=null)
                m.next.prev=m;
                //else
                //m.next
                cur.child=null;
            }
            cur=cur.next;
        }
        return head;
    }
}