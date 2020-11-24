class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) 
    {
        int len = l.length; 
        ArrayList<Boolean> res = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            
            int low = l[i];
            int high = r[i];
            int [] sub = Arrays.copyOfRange(nums, low, high + 1);
            
            Arrays.sort(sub);
            int diff = sub[1] - sub[0];
            boolean check = true;
            for (int j = 1; j < sub.length - 1; j++) {
                if (!(sub[j+1] - sub[j] == diff)) {
                    check = false;
                }
            }
            
            
            res.add(check);
            
        }
        
        return res;
        
    }
}