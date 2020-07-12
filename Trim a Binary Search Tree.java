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
    public TreeNode trimBST(TreeNode root, int L, int R) 
    {
        if(root==null) return root;
        if(root.val>R) return trimBST(root.left,L,R);
        if(root.val<L) return trimBST(root.right,L,R);
        root.left=trimBST(root.left,L,R);
        root.right=trimBST(root.right,L,R);
        return root;
    } 
}