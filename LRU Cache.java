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
    int sum=0;
    public int sumRootToLeaf(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }
        solve(root,0);
        return sum;
    }
    public void solve(TreeNode root, int n)
    {
        if(root==null)
        {
            return;
        }
        //System.out.println(n+"  "+root.val);
        if(root.val==0)
        {
            n=n<<1;
        }
        else
        {
            n=n<<1;
            n=n|1;
        }
        if(root.left==null&&root.right==null)
        {
            //System.out.println(n);
            sum=sum+n;class LRUCache {
    private final Map<Integer, Integer> map;
    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }
}
        }
        solve(root.left,n);
        solve(root.right,n);
        
    }
    
}