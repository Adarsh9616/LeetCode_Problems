class Solution {
    public String longestCommonPrefix(String[] st) 
    {
        if(st.length==0)
        {
            return "";
        }
        String max=st[0];
        String min=st[0];
        for(String s:st)
        {
            if(max.compareTo(s)<0)
            {
                max=s;
            }
            if(min.compareTo(s)>0)
            {
                min=s;
            }
        }
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<Math.min(max.length(),min.length());i++)
        {
            if(max.charAt(i)==min.charAt(i))
            {
                ans.append(max.charAt(i));
            }
            else
            {
                break;
            }
        }
        return ans.toString();
    }
}