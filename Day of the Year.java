class Solution 
{
    public int dayOfYear(String date) 
    {  
        String[] s=date.split("-");
        int yy=Integer.parseInt(s[0]);
        int mm=Integer.parseInt(s[1]);
        int dd=Integer.parseInt(s[2]);
        int ans=0;
        int ar[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int ar1[]={31,29,31,30,31,30,31,31,30,31,30,31};
        if((yy%4==0&&yy%100!=0)||yy%400==0)
        {
            for(int i=0;i<mm-1;i++)
            {
                ans=ans+ar1[i];
            }
            ans=ans+dd;
        }
        else
        {
            for(int i=0;i<mm-1;i++)
            {
                ans=ans+ar[i];
            }
            ans=ans+dd;
        }
        
        return ans;
        
    }
}