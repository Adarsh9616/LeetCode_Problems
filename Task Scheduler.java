class Solution {
    public int leastInterval(char[] tasks, int n) 
    {
        int ar[]=new int[26];
        for(char c:tasks)
        {
            ar[c-'A']++;
        }
        Arrays.sort(ar);
        int maxVal=ar[25]-1;
        int totalIdle=n*maxVal;
        for(int i=24;i>=0;i--)
        {
            totalIdle-=Math.min(ar[i],maxVal);
        }
        return totalIdle>0?totalIdle+tasks.length:tasks.length;
    }
}