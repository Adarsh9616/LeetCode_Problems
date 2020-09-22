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
    boolean ans=false;
    public boolean hasPathSum(TreeNode root, int sum) 
    {
        solve(root,sum,0);
        return ans;
    }
    public void solve(TreeNode t,int sum,int newsum)
    {
        if(t==null)
        {
            return;
        }
        if(t.left==null&&t.right==null)
        {
            newsum=newsum+t.val;
            //System.out.println(newsum);
            if(newsum==sum)
            {
                
                ans=true;
            }
        }
        newsum=newsum+t.val;
        solve(t.left,sum,newsum); 
        solve(t.right,sum,newsum);
        newsum=newsum-t.val;
        
    }
    
}