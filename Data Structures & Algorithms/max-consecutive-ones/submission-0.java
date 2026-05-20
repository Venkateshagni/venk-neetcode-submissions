class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int num : nums) {
            if (num != 1) {
                if (count > max) {
                    max = count;
                    count = 0;
                    continue;
                }
            }
            count++;
        }
        if (count > max) {
            max = count;
        }
        return max;
    }
}