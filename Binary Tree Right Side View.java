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
class Solution {
    public List<Integer> rightSideView(TreeNode root) 
    {
        if(root==null)
        {
            return new ArrayList<>();
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                
                TreeNode curr=q.poll();
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
                if(i==size-1)
                {
                    ans.add(curr.val);
                }
            }
        }
        return ans;
    }
}