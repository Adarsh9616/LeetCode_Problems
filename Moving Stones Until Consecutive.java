class Solution {
    public int[] numMovesStones(int a, int b, int c)
    {
        int min=0;int max=0;
        int ar[]=new int[3];;
        ar[0]=a;
        ar[1]=b;
        ar[2]=c;
        Arrays.sort(ar);
        if(ar[0]+1!=ar[1])
        {
            min++;
        }
        if(ar[1]+1!=ar[2])
        {
            min++;
        }
        if(ar[2]-ar[1]==2||ar[1]-ar[0]==2)
        {
            min=1;
        }
        max=ar[2]-ar[1]-1+ar[1]-ar[0]-1;
        return new int[]{min,max};
            
        
    }
}