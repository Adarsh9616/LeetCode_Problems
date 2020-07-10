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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        solve(root1,a);
        solve(root2,b);
        if(a.size()!=b.size())
        {
            return false;
        }
        else
        {
            for(int i=0;i<a.size();i++)
            {
                if(a.get(i)!=b.get(i))
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public void solve(TreeNode t,ArrayList<Integer> x)
    {
        if(t==null)
        {
            return;
        }
        if(t.left==null&&t.right==null)
        {
            x.add(t.val);
        }
        solve(t.left,x);
        solve(t.right,x);
    }
    
}