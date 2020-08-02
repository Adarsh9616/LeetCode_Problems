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
    public int maxLevelSum(TreeNode root) 
    {
        int max=Integer.MIN_VALUE;
        Queue<TreeNode> q=new LinkedList<>();
        int level=1;
        int ans=-1;
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode n=q.poll();
                sum=sum+n.val;
                if(n.left!=null)
                {
                    q.add(n.left);
                }
                if(n.right!=null)
                {
                    q.add(n.right);
                }
            }
            if(sum>max)
            {
                max=sum;
                ans=level;
            }
            level++;
        }
        return ans;
        
    }
}