class Solution 
{
    List<List<Integer>> list;
    public String largestTimeFromDigits(int[] A) 
    {
        int count=0;
        for(int i:A)
        {
            if(i<=2)
            {
                count++;
            }
        }
        if(count==0)
        {
            return "";
        }
        list=new ArrayList<>();
        List<String> ar=new ArrayList<>();
        permute(A,0,A.length-1);
        for(List<Integer> i:list)
        {
            StringBuilder s=new StringBuilder("");
            if(isValid(i))
            {
                s.append(i.get(0));
                s.append(i.get(1));
                s.append(":");
                s.append(i.get(2));
                s.append(i.get(3));
                ar.add(s.toString());
            }
        }
        Collections.sort(ar);
        String ans="";
        if(ar.size()>0)
        {
            ans=ar.get(ar.size()-1);
        }
        return ans;
    }
    public boolean isValid(List<Integer> s)
    {
        if(s.get(0)>2)
        {
            return false;
        }
        if(s.get(1)>3&&s.get(0)==2)
        {
            return false;
        }
        if(s.get(2)>5)
        {
            return false;
        }
        return true;
    }
    public void permute(int A[],int l,int r)
    {
        if(l==r)
        { 
            List<Integer> e=new ArrayList<>();
            e.add(A[0]);
            e.add(A[1]);
            e.add(A[2]);
            e.add(A[3]);
            list.add(e);
            //System.out.println(e);
            return;
        }
        for(int i=l;i<=r;i++)
        {
            swap(A,i,l);
            permute(A,l+1,r);
            swap(A,i,l);
        }
    }
    public void swap(int A[],int i,int j)
    {
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
}