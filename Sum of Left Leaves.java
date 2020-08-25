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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) 
    {
        solve(root);
        return sum;
    }
    public void solve(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        if(isLeaf(root.left))
        {
            sum+=root.left.val;
        }
        solve(root.left);
        solve(root.right);
    }
    public boolean isLeaf(TreeNode root)
    {
        if(root==null)
        {
            return false;
        }
        if(root.left==null&&root.right==null)
        {
            return true;
        }
        return false;
    }
}