class Solution {
    public int[][] reconstructQueue(int[][] people) 
    {
        Arrays.sort(people,(a,b)->(a[0]==b[0]?a[1]-b[1]:b[0]-a[0]));
        List<int[]> p=new ArrayList<>();
        for(int[] a:people)
        {
            p.add(a[1],a);
        }
        return p.toArray(new int[people.length][2]);
    }
}