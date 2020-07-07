class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        int[] count = new int[2001];
        for(int a : arr) {
            count[a + 1000]++;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int c : count) {
            if(c != 0) {
                if(set.contains(c)) return false;
                set.add(c);
            }
        }
        return true;
    }
}