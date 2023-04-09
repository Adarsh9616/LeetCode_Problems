class Solution {
    public List<Integer> pathInZigZagTree(int label) {
       int level = 0;
        int count = 0;
        while (label > count) {
            count += Math.pow(2, level); // 1  3 7 15
            level++;   // 1 2 3 4
        }
        level = level - 1;
        List<Integer> result = new ArrayList<>();

        while (level >= 0) {
            result.add(0, label);
            int min = (int)Math.pow(2, level);
            int max = (int)Math.pow(2, level+1)-1;
            int reversedLabel = min + max - label;
            label = reversedLabel/2;
            level = level - 1;
        }
        return result;
    }
}