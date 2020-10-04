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
        if(root.left==null&&root.right==null)
        {
            return 0;
        }
        solve(root);
        return ans-1;
    }
    public int solve(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=solve(root.left);
        int right=solve(root.right);
        int temp=Math.max(left,right)+1;
        int res=Math.max(temp,left+right+1);
        ans=Math.max(ans,res);
        return temp;
    }
}