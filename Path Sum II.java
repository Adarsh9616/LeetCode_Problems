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
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) 
    {
        List<Integer> temp=new ArrayList<>();
        solve(root,sum,0, temp);
        return ans;
    }
    public void solve(TreeNode root,int sum,int currentSum,List<Integer> temp)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right==null)
        {
            currentSum+=root.val;
            temp.add(root.val);
            if(currentSum==sum)
            {
                ans.add(new ArrayList<>(temp));
            }
            temp.remove(temp.size()-1);
        }
        currentSum+=root.val;
        temp.add(root.val);
        solve(root.left,sum,currentSum,temp);
        solve(root.right,sum,currentSum,temp);
        temp.remove(temp.size()-1);
    }
}