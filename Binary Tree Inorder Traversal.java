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
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        TreeNode cur=root;
        Stack<TreeNode> s=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        while(cur!=null||!s.isEmpty())
        {
            while(cur!=null)
            {
                s.push(cur);
                cur=cur.left;
            }
            cur=s.pop();
            ans.add(cur.val);
            cur=cur.right;
        }
        return ans;
    }
}