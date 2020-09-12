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
    public TreeNode constructMaximumBinaryTree(int[] nums) 
    {
        int start=0;
        int end=nums.length-1;
        return solve(nums,start,end);
    }
    public TreeNode solve(int ar[],int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        else if(start==end)
        {
            return new TreeNode(ar[start]);
        }
        int index=find(ar,start,end);
        TreeNode t=new TreeNode(ar[index]);
        t.left=solve(ar,start,index-1);
        t.right=solve(ar,index+1,end);
        return t;
    }
    public int find(int ar[],int start,int end)
    {
        int max=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=start;i<=end;i++)
        {
            if(max<ar[i])
            {
                idx=i;
                max=ar[i];
            }
        }
        return idx;
    }
}