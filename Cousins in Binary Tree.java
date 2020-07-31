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
    public boolean isCousins(TreeNode root, int x, int y) 
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            Set<Integer> s=new HashSet<>();
            for(int i=0;i<size;i++)
            {
                TreeNode n=q.remove();
                boolean left=false;
                boolean right=false;
                if(n.left!=null)
                {
                    q.add(n.left);
                    int k=n.left.val;
                    if(k==x||k==y)
                    {
                        left=true;
                    }
                    s.add(k);
                }
                if(n.right!=null)
                {
                    q.add(n.right);
                    int k=n.right.val;
                    if(k==x||k==y)
                    {
                        right=true;
                    }
                    s.add(k);
                }
                if(left&&right)
                {
                    return false;
                }
            }
            if(s.contains(x)&&s.contains(y))
            {
                return true;
            }
        }
        return false;
    }
}