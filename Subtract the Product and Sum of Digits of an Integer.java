class Solution {
    public int subtractProductAndSum(int n) 
    {
        int sum=0;
        int mul=1;
        while(n>0)
        {
            int k=n%10;
            sum=sum+k;
            mul=mul*k;
            n=n/10;
        }
        return (mul-sum);
        
    }
}