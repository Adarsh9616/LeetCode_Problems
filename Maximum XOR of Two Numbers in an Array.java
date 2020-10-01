class Solution 
{
    class TrieNode
    {
        TrieNode left0;
        TrieNode right1;
    }
    public void insert(TrieNode head,int val)
    {
        TrieNode curr=head;
        for(int i=31;i>=0;i--)
        {
            int bit=(val>>i)&1;
            if(bit==0)
            {
                if(curr.left0==null)
                {
                    curr.left0=new TrieNode();
                }
                curr=curr.left0;
            }
            else
            {
                if(curr.right1==null)
                {
                    curr.right1=new TrieNode();
                }
                curr=curr.right1;
            }
        }
    }
    public int maxValue(TrieNode head,int val)
    {
        int temp=0;
        TrieNode curr=head;
        for(int i=31;i>=0;i--)
        {
            int bit=(val>>i)&1;
            if(bit==0)
            {
                if(curr.right1!=null)
                {
                    temp+=(int)Math.pow(2,i);
                    curr=curr.right1;
                }
                else
                {
                    curr=curr.left0;
                }
            }
            else
            {
                if(curr.left0!=null)
                {
                    temp+=(int)Math.pow(2,i);
                    curr=curr.left0;
                }
                else
                {
                    curr=curr.right1;
                }
            }
        }
        return temp;
    }
    public int findMaximumXOR(int[] nums) 
    {        
        TrieNode head=new TrieNode();
        for(int i:nums)
        {
            insert(head,i);
        }
        int max=Integer.MIN_VALUE;
        for(int i:nums)
        {
            max=Math.max(max,maxValue(head,i));
        }
        return max;
    }
}