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
    int sum=0;
    int maxDepth;
    public int deepestLeavesSum(TreeNode root) 
    {
        maxDepth=find(root);
        traverse(root,0);
        return sum;
    }
    public void traverse(TreeNode root,int len)
    {
        if(root==null)
        {
            return;
        }
        if(len==maxDepth-1)
        {
            sum+=root.val;
        }
        traverse(root.left,len+1);
        traverse(root.right,len+1);
    }
    public int find(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int l=find(root.left);
        int r=find(root.right);
        return Math.max(l,r)+1;
    }
}