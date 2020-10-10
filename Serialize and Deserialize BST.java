/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) 
    {
        if(root==null)
        {
            return "";
        }
        StringBuilder sb=new StringBuilder("");
        dfs(sb,root);
        return sb.toString();
    }
    public void dfs(StringBuilder sb, TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        sb.append(root.val+" ");
        dfs(sb,root.left);
        dfs(sb,root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) 
    {
        if(data.isEmpty())
        {
            return null;
        }
        String ar[]=data.split(" ");
        return construct(ar,0,ar.length-1);
    }
    public TreeNode construct(String ar[],int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(ar[start]));
        int i;
        for(i=start;i<=end;i++)
        {
            if(Integer.parseInt(ar[i])>Integer.parseInt(ar[start]))
            {
                break;
            }
        }
        root.left=construct(ar,start+1,i-1);
        root.right=construct(ar,i,end);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;