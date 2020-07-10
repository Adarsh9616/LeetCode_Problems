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
    public TreeNode invertTree(TreeNode root) 
    {
        if(root==null)
        {
            return null;
        }
        // TreeNode right=invertTree(root.right);
        // TreeNode left=invertTree(root.left);
        // root.left=right;
        // root.right=left;
        // return root;
//         Approach 2
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode current=q.poll();
            TreeNode temp=current.left;
            current.left=current.right;
            current.right=temp;
            if(current.left!=null)q.add(current.left);
            if(current.right!=null)q.add(current.right);
        }
        return root;
    }
}