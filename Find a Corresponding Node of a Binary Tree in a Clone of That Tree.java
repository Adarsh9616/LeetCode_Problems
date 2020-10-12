/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution 
{
    public TreeNode traverse(TreeNode root1,TreeNode root2,TreeNode target)
    {
        if(root1==null)
        {
            return null;
        } 
        if(root1==target)
        {
            return root2;
        }
        TreeNode x=traverse(root1.left,root2.left,target);
        if(x==null)
        {
            return traverse(root1.right,root2.right,target);
        } 
        else
        {
            return x;
        }
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) 
    {
        return traverse(original,cloned,target);
    }
}