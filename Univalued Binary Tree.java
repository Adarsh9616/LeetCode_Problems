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
    Set<Integer> s=new HashSet<>();
    public boolean isUnivalTree(TreeNode root) 
    {
        solve(root);
        if(s.size()==1)
            return true;
        else 
            return false;
    }
    public void solve(TreeNode t)
    {
        if(t==null)
        {
            return;
        }
        solve(t.left);
        s.add(t.val);
        solve(t.right);
    }
}