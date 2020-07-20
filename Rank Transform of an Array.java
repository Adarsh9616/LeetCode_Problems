class Solution {
    public int[] arrayRankTransform(int[] arr) 
    {
        int ar[] =arr.clone();
        Arrays.sort(ar);
        HashMap<Integer,Integer> m=new HashMap<>();
        int k=1;
        for(int i=0;i<ar.length;i++)
        {
            if(!m.containsKey(ar[i]))
                m.put(ar[i],k++);
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=m.get(arr[i]);
        }
        return arr;
        
        
    }
}