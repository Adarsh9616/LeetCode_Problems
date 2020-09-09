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
    public int sumRootToLeaf(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }
        solve(root,0);
        return sum;
    }
    public void solve(TreeNode root, int n)
    {
        if(root==null)
        {
            return;
        }
        //System.out.println(n+"  "+root.val);
        if(root.val==0)
        {
            n=n<<1;
        }
        else
        {
            n=n<<1;
            n=n|1;
        }
        if(root.left==null&&root.right==null)
        {
            //System.out.println(n);
            sum=sum+n;
        }
        solve(root.left,n);
        solve(root.right,n);
        
    }
    
}