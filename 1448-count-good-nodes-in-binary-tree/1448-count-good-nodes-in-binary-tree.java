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
   private int goodNodes;

    public int goodNodes(TreeNode root) {
        goodNodes = 0;

        goodNodes(root, root.val);

        return goodNodes;
    }

    public void goodNodes(TreeNode root, int max) {
        if(root == null) return;

        // find the max of current node value and max till now
        max = Math.max(max, root.val);
        // check the max is less than or equal to current node value
        // if yes, increse the good nodes number
        if(max <= root.val) goodNodes++;

        // send the max to the left and right
        goodNodes(root.left, max);
        goodNodes(root.right, max);
    }
}