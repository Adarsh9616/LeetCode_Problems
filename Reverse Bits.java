public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) 
    {
        System.out.println(n);
        String s=Integer.toBinaryString(n);
        StringBuilder ss=new StringBuilder(s);
        ss=ss.reverse();
        s=ss.toString();
        while(s.length()!=32)
        {
            s=s+'0';
        }
        System.out.println(s);
        int decimal=Integer.parseUnsignedInt(s,2);
        return decimal;
    }
}