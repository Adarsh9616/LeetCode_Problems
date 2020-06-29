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
    int ans;
    public int rangeSumBST(TreeNode root, int L, int R)
    {
        ans=0;
        dfs(root,L,R);
        return ans;
    }
    public void dfs(TreeNode node,int L,int R)
    {
        if(node!=null)
        {
            if(L<=node.val && node.val<=R)
            {
                ans=ans+node.val;
            }
            if(node.val>L)
            {
                dfs(node.left,L,R);
            }
            if(node.val<R)
            {
                dfs(node.right,L,R);
            }
        }
    }
}