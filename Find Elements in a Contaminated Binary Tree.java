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
class FindElements 
{
    HashSet<Integer> set=new HashSet<>();
    public FindElements(TreeNode root) 
    {
        helper(root,0);
    }
    public void helper(TreeNode root,int v)
    {
        if(root==null)
        {
            return;
        }
        set.add(v);
        helper(root.left,2*v+1);
        helper(root.right,2*v+2);
    }
    
    public boolean find(int target) 
    {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */