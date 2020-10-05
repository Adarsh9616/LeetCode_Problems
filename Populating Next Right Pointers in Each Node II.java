/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) 
    {
        if(root==null)
        {
            return root;
        }
        if(root.left!=null)
        { 
            if(root.right!=null)
            {
                root.left.next=root.right;
            }
            else
            {
                Node temp=root;
                while(temp.next!=null)
                {
                    if(temp.next!=null)
                    {
                        if(temp.next.left!=null)
                        {
                            root.left.next=temp.next.left;
                            break;
                        }
                        else if(temp.next.right!=null)
                        {
                            root.left.next=temp.next.right;
                            break;
                        }
                    }
                    temp=temp.next;
                }

            }
        }
        if(root.right!=null)
        {
            Node temp=root;
            while(temp.next!=null)
            {
                if(temp.next!=null)
                {
                    if(temp.next.left!=null)
                    {
                        root.right.next=temp.next.left;
                        break;
                    }
                    else if(temp.next.right!=null)
                    {
                        root.right.next=temp.next.right;
                        break;
                    }
                }
                temp=temp.next;
            }
        }
        connect(root.right);
        connect(root.left);
        return root;
        
    }
}