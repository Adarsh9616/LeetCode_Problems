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
class Point
{
    TreeNode root;
    int x;
    int y;
    Point(TreeNode t,int a,int b)
    {
        root=t;
        x=a;
        y=b;
    }
    Point(Point a)
    {
        root=a.root;
        x=a.x;
        y=a.y;
    }
}
class Solution implements Comparator<Point>
{

    public int compare(Point a,Point b)
    {
        if(a.y==b.y)
        {
        return a.root.val-b.root.val;
        }
        else
        {
            return a.y-b.y;
        }
    }
    Map<Integer,List<Point>> m=new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) 
    {
        
        List<List<Integer>> ans=new ArrayList<>();
        Queue<Point> q=new LinkedList<>();
        Point p=new Point(root,0,0);
        q.add(p);
        while(!q.isEmpty())
        {
            Point t=new Point(q.remove());
            if(m.containsKey(t.x))
            {
                List<Point> l=m.get(t.x);
                l.add(t);
                m.put(t.x,l);
            }
            else
            {
                List<Point> l=new ArrayList<>();
                l.add(t);
                m.put(t.x,l);
            }
            if(t.root.left!=null)
            {
                Point a=new Point(t.root.left,t.x-1,t.y+1);
                q.add(a);
            }
            if(t.root.right!=null)
            {
                 Point a=new Point(t.root.right,t.x+1,t.y+1);
                q.add(a);
            }
        }
        
        
        for(int i:m.keySet())
        {
            List<Point> l=m.get(i);
            Collections.sort(l,new Solution());
            List<Integer> aa=new ArrayList<>();
            for(Point m:l)
            {
            aa.add(m.root.val);
            }
            ans.add(aa);
        }
        return ans;
    }
}