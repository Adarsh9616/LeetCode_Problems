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
    Set<Integer> s=new TreeSet<>();
    public int findSecondMinimumValue(TreeNode root) 
    {
        solve(root);
        int k=-1;
        int j=1;
        for(int i:s)
        {
            if(j>2)
            {
                break;
            }
            j++;
            k=i;
        }
        return s.size()<2?-1:k;
    }
    public void solve(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        s.add(root.val);
        solve(root.left);
        solve(root.right);
    }
}