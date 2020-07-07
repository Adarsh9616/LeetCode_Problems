/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution 
{
    int depth=0;int max=0;
    public int maxDepth(Node root) 
    {
        solve(root);
        return max;
    }
    public void solve(Node root)
    {
        
        if(root==null)
        {
            
            return;
        }
        depth++;
        max=Math.max(max,depth);
        for(Node n:root.children)
        {
            
            solve(n);
            
            depth--;
        }
        
    }
}