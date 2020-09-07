/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution 
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if(root==null)
        {
            return null;
        }
        if(p==root)
        {
            return root;
        }
        if(q==root)
        {
            return root;
        }
        List<TreeNode> l1=new ArrayList<>();
        List<TreeNode> l2=new ArrayList<>();
        solve(root,p,l1);
        solve(root,q,l2);
        int i1=l1.size()-1;int i2=l2.size()-1;
        while(i1>=0&&i2>=0)
        {
            if(l1.get(i1)!=l2.get(i2))
            {
                break;
            }
            i1--;
            i2--;
        }
        i1++;
        return l1.get(i1);
        
    }
    public boolean solve(TreeNode root,TreeNode x,List<TreeNode> l)
    {
        if(root==null)
        {
            return false;
        }
        
        if(root==x||solve(root.left,x,l)||solve(root.right,x,l))
        {
            l.add(root);
            return true;
        }
        return false;
    }
}