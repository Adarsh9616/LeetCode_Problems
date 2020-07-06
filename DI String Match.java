class Solution 
{
    public int[] diStringMatch(String S) 
    {
        StringBuilder s=new StringBuilder(S);
        int n=s.length();
        int ar[]=new int[n+1];
        int i=0;
        int j=0;
        int k=n;
        ar[0]=0;
        s.append(s.charAt(n-1));
        for(char c:String.valueOf(s).toCharArray())
        {
            switch(c)
            {
                case 'I':ar[i]=j;j++;i++;break;
                case 'D':ar[i]=k;k--;i++;break;
            }
        }
        return ar;
    }
}