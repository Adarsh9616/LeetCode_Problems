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
    int sum;
    public int sumRootToLeaf(TreeNode root) {
        findSum(root,0);
        return sum;
    }
    public void findSum(TreeNode root,int num)
    {
        if(root==null)
            return;
        num=num*2 + root.val;
        findSum(root.left,num);
        findSum(root.right,num);
        if((root.left==null) && (root.right==null))
        {
            sum+=num;
        }
    }
}