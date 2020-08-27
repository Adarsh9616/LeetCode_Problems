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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        if(root==null)
        {
            return new ArrayList<>();
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<List<Integer>> ans=new ArrayList<>();
        int k=1;
        while(!q.isEmpty())
        {
            List<Integer> l=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp=q.poll();
                l.add(temp.val);
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
            if((k&1)==0)
            {
                Collections.reverse(l);
            }
            ans.add(l);
            k++;
        }
        return ans;
        
    }
}