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
    public int maxDepth(TreeNode root) 
    {
        return solve(root,0);
    }
    public int solve(TreeNode root,int depth)
    {
        if(root==null)
        {
            return 0;
        }
        int l=solve(root.left,depth);
        int r=solve(root.right,depth);
        
        return Math.max(l,r)+1;
    }
}