/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K)
    {
        List<Integer> ans =new ArrayList<>();
        if(root==null|| target==null)
        {
            return ans;
        }
        HashMap<TreeNode,TreeNode> childParent=new HashMap<>();
        createChildParent(root,childParent);
        Queue<TreeNode> q=new LinkedList<>();
        HashSet<TreeNode> visited=new HashSet<>();
        q.add(target);
        visited.add(target);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                visited.add(curr);
                if(K==0)
                {
                    ans.add(curr.val);
                }
                if(childParent.containsKey(curr)&&!visited.contains(childParent.get(curr)))
                {
                    q.add(childParent.get(curr));
                }
                if(curr.left!=null&&!visited.contains(curr.left))
                {
                    q.add(curr.left);
                }
                if(curr.right!=null&&!visited.contains(curr.right))
                {
                    q.add(curr.right);
                }
            }
            K--;
            if(K<0)
            {
                break;
            }
        }
        return ans;
    }
    public void createChildParent(TreeNode root,HashMap<TreeNode , TreeNode> map)
    {
        if(root==null)
        {
            return ;
        }
        if(root.right!=null)
        {
            map.put(root.right,root);
        }
        if(root.left!=null)
        {
            map.put(root.left,root);
        }
        createChildParent(root.left,map);
        createChildParent(root.right,map);
    }
}