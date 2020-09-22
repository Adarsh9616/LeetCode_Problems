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
    public int sumNumbers(TreeNode root) 
    {
        solve(root,0);
        return sum;
    }
    public void solve(TreeNode root,int newsum)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right==null)
        {
            newsum=newsum*10+root.val;
            sum=sum+newsum;
        }
        newsum=newsum*10+root.val;
        solve(root.left,newsum);
        solve(root.right,newsum);
        newsum=newsum/10;
    }
}