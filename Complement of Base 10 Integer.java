class Solution {
    public int bitwiseComplement(int N) 
    {
         if(N == 0)
            return 1;
        int result = 0;
        //use set to set the value of result in each bit
        int set = 1;
        while(N != 0) {
            //if last bit is 0 , set corresponding position of result to 1
            if((N & 1)== 0) {
                result |= set;
            }
            //if last bit of num is 1, then do not need to set result
            set <<= 1; // left shift 1 bit
            N >>= 1;//right shift num, move right 1 bit
        }
        return result;
    }
}