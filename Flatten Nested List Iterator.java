/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

   List<NestedInteger> res;
    int size = 0;
    int index = 0;
    public NestedIterator(List<NestedInteger> nestedList) {
        res = new ArrayList<>();
        add(nestedList, res);
        size = res.size();
    }

    public void add(List<NestedInteger> nestedList, List<NestedInteger> res){
        for(NestedInteger i: nestedList){
            if(i.isInteger()){
                res.add(i);
            }else{
                add(i.getList(), res);
            }
        }
    }
    @Override
    public Integer next() {
        if(hasNext()){
            return res.get(index++).getInteger();
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */