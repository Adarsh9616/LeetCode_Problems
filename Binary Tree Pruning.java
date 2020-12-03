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
class Solution {
    public TreeNode pruneTree(TreeNode root) 
    {
        if(root==null)
        {
            return null;
        }
        return helper(root);
    }
    TreeNode helper(TreeNode root)
    {
        if(root==null)
        {
            return null;
        }
        root.left=helper(root.left);
        root.right=helper(root.right);
        if(root.left==null&&root.right==null&&root.val==0)
        {
            return null;
        }
        return root;
    }
}