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
    Map<Integer,Integer> m=new HashMap<>();
    public int[] findMode(TreeNode root) 
    {
        solve(root);
        List<Integer> l=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i:m.keySet())
        {
            if(m.get(i)>max)
            {
                l.clear();
                l.add(i);
                max=m.get(i);
            }
            else if(m.get(i)==max)
            {
                l.add(i);
            }
        }
        int ar[]=new int[l.size()];
        int k=0;
        for(int i:l)
        {
            ar[k++]=i;
        }
        return ar;
    }
    public void solve(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        m.put(root.val,m.getOrDefault(root.val,0)+1);
        solve(root.left);
        solve(root.right);
    }
}