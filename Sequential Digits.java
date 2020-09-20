class Solution {
    public List<Integer> sequentialDigits(int low, int high) 
    {
        int ar[]=new int[]{1,2,3,4,5,6,7,8,9};
        List<Integer> ans=new ArrayList<>();
        int count1=0;
        int count2=0;
        int t=low;
        while(t>0)
        {
            count1++;
            t/=10;
        }
        t=high;
        while(t>0)
        {
            count2++;
            t/=10;
        }
        
        while(count1<=count2)
        {
            long temp=0;
            for(int i=0;i<count1&&i<9;i++)
            {
                temp=temp*10+ar[i];
            }
            if(temp>=low&&temp<=high)
            {
                ans.add((int)temp);
            }
            long div=(long)Math.pow(10,count1-1);
            if(count1==9)
            {
                break;
            }
            for(int i=count1;i<9;i++)
            { 
                
                long k=temp/div;
                k=k*div;
                temp=temp-k;
                temp=temp*10+ar[i];
                //System.out.println(temp);
                if(temp>=low&&temp<=high)
                {
                    ans.add((int)temp);
                }
                if(temp>high)
                {
                    break;
                }
            }
               
            count1++;
        }
        return ans;
    }
}