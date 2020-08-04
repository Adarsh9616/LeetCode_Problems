class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) 
    {
        int temp = 0;
        List<Boolean> result = new ArrayList<Boolean>(A.length);
        for (int i = 0; i < A.length; i++) {
            temp = (temp * 2 + A[i]) % 5;
            if (temp == 0)
                result.add( Boolean.TRUE);
            else result.add( Boolean.FALSE);
        }
        return result;
    }
}