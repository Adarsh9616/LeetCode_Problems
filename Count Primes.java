class Solution {
    public int countPrimes(int n) 
    {
        if(n<=2) return 0;
        boolean[] not_prime = new boolean[n];
        for(int i=2;i*i<n;i++){
            if(not_prime[i]) continue;
            for(int j=i*i;j<n;j+=i){
                not_prime[j] = true;
            }
        }
        int count=1;
        for(int i=3;i<n;i+=2) if(!not_prime[i]) count++;
        return count;
    }
}