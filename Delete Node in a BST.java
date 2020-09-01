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
    public TreeNode deleteNode(TreeNode root, int key) 
    {
        if(root==null)
        {
            return null;
        }
        if(root.val>key)
        {
             root.left=deleteNode(root.left,key);
        }
        else if(root.val<key)
        {
             root.right=deleteNode(root.right,key);
        }
        else
        {
            if(root.right==null&&root.left==null)
            {
                return null;
            }
            else if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            else
            {
                int max=findMax(root.left);
                root.val=max;
                root.left=deleteNode(root.left,max);
                return root;
            }
        }
        return root;
    }
    public int findMax(TreeNode root)
    {
        int max=root.val;
        while(root!=null)
        {
            max=Math.max(root.val,max);
            root=root.right;
        }
        return max;
    }
}