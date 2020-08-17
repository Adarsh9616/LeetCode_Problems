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
    int maxLength=0;
    public int longestUnivaluePath(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }
        solve(root);
        return maxLength;
    }
    public int solve(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int l=solve(root.left);
        int r=solve(root.right);
        int al=0;
        int ar=0;
        if(root.left!=null&&root.left.val==root.val)
        {
            al+=l+1;
        }
        if(root.right!=null&&root.right.val==root.val)
        {
            ar+=r+1;
        }
        maxLength=Math.max(maxLength,al+ar);
        return Math.max(ar,al);
                
    }
}