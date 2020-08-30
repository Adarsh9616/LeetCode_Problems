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
    Map<Integer, Integer> m ;
    public TreeNode buildTree(int[] preorder, int[] inorder)
    {
        if (inorder.length == 0) {
            return null;
        }
        m = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            m.put(inorder[i], i);
        }
        return solve(preorder,inorder,0,inorder.length-1,0,preorder.length-1);
    }
    public TreeNode solve(int pre[],int in[],int inS,int inE,int preS,int preE)
    {
        if(inS>inE)
        {
            return null;
        }
        int root=pre[preS];
        int index=m.get(root);
        int linS=inS;
        int linE=index-1;
        int lpreS=preS+1;
        int lpreE=lpreS+(linE-linS);//imp
        int rinS=index+1;
        int rinE=inE;
        int rpreS=lpreE+1;//imp
        int rpreE=preE;
        TreeNode t=new TreeNode(root);
        t.left=solve(pre,in,linS,linE,lpreS,lpreE);
        t.right=solve(pre,in,rinS,rinE,rpreS,rpreE);
        return t;
    }
}