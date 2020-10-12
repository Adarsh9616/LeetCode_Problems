class Solution {
    public int numTeams(int[] rating) 
    {
        int n = rating.length;
        int[] gre = new int[n], low = new int[n];
        for(int i =0;i < n-1;i++) {
            int l = 0, h = 0;
            for(int j = i+1;j < n;j++) {
                if(rating[j] > rating[i]) h++;
                if(rating[j] < rating[i]) l++;
            }
            gre[i] = h;low[i] = l;
        }
        int count = 0;
        for(int i = 0;i < n-2;i++) {
            for(int j = i+1;j < n-1;j++) {
                if(rating[j] > rating[i]) {
                    count += gre[j];
                }else if(rating[j] < rating[i]) {
                    count += low[j];
                }
            }
        }
        return count;
    }
}