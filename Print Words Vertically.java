class Solution {
    public List<String> printVertically(String s) 
    {
        List<String> ans=new ArrayList<>();
        String[] ar=s.split(" ");
        int maxLen=-1;
        for(String a:ar)
        {
            maxLen=Math.max(maxLen,a.length());
        }
        for(int i=0;i<maxLen;i++)
        {
            StringBuilder temp=new StringBuilder("");
            for(int j=0;j<ar.length;j++)
            {
                char ch=' ';
                if(ar[j].length()>i)
                {
                    ch=ar[j].charAt(i);
                }
                temp.append(ch);
            }
            ans.add(temp.toString().stripTrailing());
        }
        return ans;
    }
}