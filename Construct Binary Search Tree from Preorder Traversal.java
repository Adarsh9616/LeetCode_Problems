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
    public TreeNode bstFromPreorder(int[] preorder) 
    {
        TreeNode root=solve(preorder,0,preorder.length-1);
        return root;
    }
    public TreeNode solve(int ar[],int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        TreeNode root=new TreeNode(ar[start]);
        int i;
        for(i=start;i<=end;i++)
        {
            if(ar[i]>ar[start])
            {
                break;
            }
        }
        root.left=solve(ar,start+1,i-1);
        root.right=solve(ar,i,end);
        return root;
    }
}