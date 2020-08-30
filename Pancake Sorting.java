class Solution
{
    public int find(int ar[],int x)
    {
        for(int i=0;i<x;i++)
        {
            if(ar[i]==x)
            {
                return i;
            }
        }
        return -1;
    }
    public void flip(int ar[],int x)
    {
        for(int i=0;i<=x/2;i++)
        {
            int temp=ar[i];
            ar[i]=ar[x-i];
            ar[x-i]=temp;
        }
        //System.out.println(Arrays.toString(ar));
    }
    public List<Integer> pancakeSort(int[] A) 
    {
        List<Integer> ans=new ArrayList<>();
        int end=A.length;
        while(end!=1)
        {
            int i=find(A,end);
            flip(A,i);
            flip(A,end-1);
            ans.add(i+1);
            ans.add(end);
            end--;
        }
        return ans;
    }
}