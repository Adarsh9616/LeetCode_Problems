class Solution {
    public int titleToNumber(String s) 
    {
         int n=s.length();
    int ans=0;

    int pow=(int)(Math.pow(26,n-1));
    
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        ans+=(ch-'A'+1)*pow;
        pow=pow/26;
    }
    
    return ans;
        
    }
}