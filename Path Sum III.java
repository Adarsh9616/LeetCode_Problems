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

// O(N^2)
class Solution 
{
    int total=0;
    public int pathSum(TreeNode root, int sum)
    {
        if(root==null)
        {
            return 0;
        }
        findPath(root,sum,0);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        
        return total;
    }
    public void findPath(TreeNode root,int sum,int currentSum)
    {
        if(root==null)
        {
            return;
        }
        currentSum+=root.val;
        if(sum==currentSum)
        {
            total++;
        }
        findPath(root.left,sum,currentSum);
        findPath(root.right,sum,currentSum);
        
    }
}