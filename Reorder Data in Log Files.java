class Solution {
    public String[] reorderLogFiles(String[] logs) 
    {
        Arrays.sort(logs,(a,b)->{
           String[] s1=a.split(" ",2);
            String[] s2=b.split(" ",2);
            boolean isd1=Character.isDigit(s1[1].charAt(0));
            boolean isd2=Character.isDigit(s2[1].charAt(0));
            if(!isd1&&!isd2)
            {
                int cmp=s1[1].compareTo(s2[1]);
                if(cmp!=0)return cmp;
                return s1[0].compareTo(s2[0]);
            }
            return isd1?(isd2?0:1):-1;
            });
        return logs;
    }
}