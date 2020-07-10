class Solution {
    public String[] findOcurrences(String text, String first, String second) 
    {
        String s[]=text.split(" ");
        List<String> ss=new ArrayList<>();
        for(int i=0;i<s.length-2;i++)
        {
            if(s[i].equals(first)&&s[i+1].equals(second))
            {
                ss.add(s[i+2]);
            }
        }
        int k=0;
        String ans[]=new String[ss.size()];
        for(String a:ss)
        {
            ans[k++]=a;
        }
        return ans;
    }
}