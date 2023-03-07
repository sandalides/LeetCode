class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        Map<Integer,Integer> hash = new HashMap<>();
        for (int i=0;i< nums.length;i++){
            if (hash.containsKey(target-nums[i])){
                output[0]=hash.get(target-nums[i]);
                output[1]=i;
            }
            hash.put(nums[i],i );
        }
        return output;
    }
}