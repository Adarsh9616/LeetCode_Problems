/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) 
    {
        if(head==null)
        {
            return head;
        }
        HashMap<Node,Node> m=new HashMap<>();
        Node cur=head;
        Node ans=new Node(0);
        Node cur1=ans;
        while(cur!=null)
        {
            cur1.val=cur.val;
            m.put(cur,cur1);
            Node temp=new Node(0);
            cur1.next=temp;
            cur1=cur1.next;
            cur=cur.next;
        }
        cur=head;
        cur1=ans;
        Node cur2=cur1;
        while(cur!=null)
        {
            cur2=cur1;
            Node temp=m.get(cur.random);
            cur1.random=temp;
            cur=cur.next;
            cur1=cur1.next;
        }
        cur2.next=null;
        return ans;
    }
}