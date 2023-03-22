class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int current_val = nums[i];
            sum += current_val;
            nums[i] = sum;
        }
        return nums;
    }
}