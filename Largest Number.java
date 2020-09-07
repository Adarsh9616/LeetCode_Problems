class Solution implements Comparator<String>
{   
    public int compare(String a,String b)
    {
        String o1=a+b;
        String o2=b+a;
        return o2.compareTo(o1);
    }
    public String largestNumber(int[] nums) 
    {
        String ar[]=new String[nums.length];
        int k=0;
        for(int i:nums)
        {
            ar[k++]=String.valueOf(i);
        }
        Arrays.sort(ar,new Solution());
        if(ar[0].equals("0"))
        {
            return "0";
        }
        StringBuilder ans=new StringBuilder("");
        for(String i:ar)
        {
            ans.append(i);
        }
        return ans.toString();
    }
}