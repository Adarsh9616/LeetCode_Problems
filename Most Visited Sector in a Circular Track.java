class Solution {
    public List<Integer> mostVisited(int n, int[] rounds)
    {
        List<Integer> list = new ArrayList<>();
        int length = rounds.length;
        int start = rounds[0];
        int end = rounds[length-1];
        if(start <= end)
        {
            while(start <= end) {
                list.add(start);
                start++;
            }
        }
        else
        {
            
            int x = 1;
            
            while(x <= end){
                list.add(x);
                x++;
            }
            while(start <= n){
                list.add(start);
                start++;
            }
        }
        return list;
    }
}