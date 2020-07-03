class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        List<Integer> output = new ArrayList<>();
        for(int i = left; i <= right; i++) if(isSelfDividing(i)) output.add(i);    
        return output;
    }
    
    public boolean isSelfDividing(int num) {
        int iterNum = num;
        while(iterNum > 0) {
            if(iterNum % 10 == 0) return false;
            if(num % (iterNum % 10) != 0) return false;
            iterNum /= 10;
        }
        return true;
    }
}