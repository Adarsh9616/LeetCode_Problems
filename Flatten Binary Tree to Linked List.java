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
    public void flatten(TreeNode root) 
    {
        rec(root);
    }
    public TreeNode rec(TreeNode root)
    {
        if(root==null)
        {
            return null;
        }
        TreeNode l=rec(root.left);
        TreeNode r=rec(root.right);
        root.left=null;
        
        if(l!=null)
        {
            root.right=l;
            while(l.right!=null)
            {
                l=l.right;
            }
            l.right=r;
        }
        
        return root;
    }
}