class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> h = new LinkedHashSet<Integer>();

        for(int i: nums){
           h.add(i);
        }

        int index = 0;
        for(int val : h) {
            nums[index++] = val;
        }
        
        return h.size();

    }
}