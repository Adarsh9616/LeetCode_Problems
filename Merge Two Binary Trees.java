/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{ 
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) 
    {
        return solve(t1,t2);
        
    }
    public TreeNode solve(TreeNode t1,TreeNode t2)
    {
        if(t1==null&&t2==null)
        {
            return null;
        }
        if(t1==null)
        {
            return t2;
        }
        else if(t2==null)
        {
            return t1;
        }
        else
        {
            int tt=t1.val+t2.val;
            TreeNode temp=new TreeNode(tt);
            temp.left=solve(t1.left,t2.left);
            temp.right=solve(t1.right,t2.right);
            return temp;
        }
    }
}