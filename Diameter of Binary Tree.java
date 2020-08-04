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
    int ans;
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }
        ans=1;
        solve(root);
        
        return ans-1;
        
    }
    public int solve(TreeNode t)
    {
        if(t==null)
        {
            return 0;
        }
        int l=solve(t.left);
        int r=solve(t.right);
        ans=Math.max(ans,l+r+1);
        return Math.max(l,r)+1;
    }
}