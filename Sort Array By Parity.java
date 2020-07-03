class Solution {
    public int[] sortArrayByParity(int[] A) 
    {
        ArrayList<Integer> e=new ArrayList<>();
        ArrayList<Integer> o=new ArrayList<>();
        for(int i:A)
        {
            if((i&1)==0)
            {
                e.add(i);
            }
            else
            {
                o.add(i);
            }
        }
        int i=0;
        for(int j:e)
        {
            A[i]=j;
            i++;
        }
        for(int j:o)
        {
            A[i]=j;
            i++;
        }
        return A;
    }
}