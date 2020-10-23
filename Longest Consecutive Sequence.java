class Solution {
    public int longestConsecutive(int[] nums)
    {
        Set<Long> num_set = new HashSet<Long>();
        for (int num : nums) {
            num_set.add((long)num);
        }

        long longestStreak = 0;

        for (long num : num_set) {
            if (!num_set.contains((long)num-1)) {
                long currentNum = num;
                long currentStreak = 1;

                while (num_set.contains((long)currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return (int)longestStreak;
    }
}