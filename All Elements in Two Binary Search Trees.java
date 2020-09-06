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
    List<Integer> l1=new ArrayList<>();
    List<Integer> l2=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) 
    {
        solve(root1,l1);
        solve(root2,l2);
        return merge(l1,l2);
    }
    public void solve(TreeNode t,List<Integer> l)
    {
        if(t==null)
        {
            return;
        }
        solve(t.left,l);
        l.add(t.val);
        solve(t.right,l);
    }
    public List<Integer> merge(List<Integer> l1,List<Integer> l2)
    {
        int i1=0;
        int i2=0;
        List<Integer> ans=new ArrayList<>();
        while(i1<l1.size()&&i2<l2.size())
        {
            int a=l1.get(i1);
            int b=l2.get(i2);
            if(a>b)
            {
                ans.add(b);
                i2++;
            }
            else if(b>a)
            {
                ans.add(a);
                i1++;
            }
            else
            {
                ans.add(a);
                ans.add(b);
                i1++;
                i2++;
            }
        }
        while(i1<l1.size())
        {
            ans.add(l1.get(i1));
            i1++;
        }
        while(i2<l2.size())
        {
            ans.add(l2.get(i2));
            i2++;
        }
        return ans;
    }
        
}