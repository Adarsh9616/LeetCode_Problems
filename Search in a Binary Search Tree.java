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
    public TreeNode searchBST(TreeNode root, int val) 
    {
        return solve(root,val);
    }
    static TreeNode solve(TreeNode t,int val)
    {
        if(t==null)
        {
            return null;
        }
        if(t.val==val)
        {
            return t;
        }
        else if(t.val>val)
        {
            return solve(t.left,val);
        }
        else
        {
            return solve(t.right,val);
        }
    }
}