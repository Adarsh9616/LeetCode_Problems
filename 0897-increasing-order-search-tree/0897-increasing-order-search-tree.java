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
    Stack<TreeNode> s=new Stack<TreeNode>();
    public TreeNode increasingBST(TreeNode root) 
    {
        solve(root);
        TreeNode prev=null;
        while(!s.isEmpty())
        {
            TreeNode temp=s.pop();
            temp.right=prev;
            temp.left=null;
            prev=temp;
        }
        return prev;
    }
    public void solve(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        solve(root.left);
        s.push(root);
        solve(root.right);
    }
}