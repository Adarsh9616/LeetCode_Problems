class Solution {
    public int compareVersion(String version1, String version2) 
    {
        String s1[]=version1.split("\\.");
        String s2[]=version2.split("\\.");
        //System.out.println(Arrays.toString(s1)+" "+Arrays.toString(s2));
        int l=Math.max(s1.length,s2.length);
        for(int i=0;i<l;i++)
        {
            int a=i<s1.length?Integer.parseInt(s1[i]):0;
            int b=i<s2.length?Integer.parseInt(s2[i]):0;
            if(a<b)
            {
                return -1;
            }
            else if(a>b)
            {
                return 1;
            }
        }
        return 0;
    }
}