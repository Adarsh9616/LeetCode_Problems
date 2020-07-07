/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) 
    {
        List<List<Integer>> vRes=new ArrayList<>();
        for (int x = 1; x <= z; x++)
		for (int y = z; y >= 1; y--)
			if (customfunction.f(x, y) == z)
            {
				List<Integer> l=new ArrayList<>();
                l.add(x);
                l.add(y);
                vRes.add(l);
            }
        return vRes;
    }
}