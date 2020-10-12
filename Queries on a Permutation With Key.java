class Solution {
    public int[] processQueries(int[] queries, int m) 
    {
        int [] result = new int [queries.length];
		LinkedList<Integer> P = new LinkedList<>();
		for (int i=1; i<=m; i++) 
        {
			P.add(i);
		}
		for (int i=0; i<queries.length; i++)
        {
			int val = queries[i];
			int index = P.indexOf(val);
			int vals = P.get(index);
			P.remove(index);
			P.addFirst(vals);
			result[i] = index;
		}
		return result;
    }
}