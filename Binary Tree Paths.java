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
    List<String> ans=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) 
    {
        if(root==null)
        {
            return new ArrayList<String>();
        }
        solve(root,"");
        
        return ans;
    }
    public void solve(TreeNode t,String s)
    {
        if(t==null)
        {
            return;
        }
        if(t.left==null&&t.right==null)
        {
            s=s+String.valueOf(t.val);
            ans.add(s);
        }
        s=s+String.valueOf(t.val)+"->";
        solve(t.left,s);
        solve(t.right,s);
    }
}