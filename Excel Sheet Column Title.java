class Solution {
    public String convertToTitle(int n) 
    {
         StringBuilder sb = new StringBuilder();
        while(n > 26){
            int i= n%26;
            if(i==0){
                sb.append((char)('Z'));
                n/=26;
                --n;
            }
            else{
            sb.append((char)(i+'A'-1));
            n/=26;
            }
        }
        sb.append((char)(n+'A'-1));
        return sb.reverse().toString();
        
    }
}