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
    int tilt=0;
    public int findTilt(TreeNode root) 
    {
        sum(root);
        return tilt;
    }
    public int sum(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int l=sum(root.left);
        int r=sum(root.right);
        tilt+=Math.abs(l-r);
        return l+r+root.val;
    }
}