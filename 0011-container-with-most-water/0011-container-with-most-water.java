class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int tankHeight = Math.min(height[i], height[j]);
            int tankWidth = j - i;
            maxArea = Math.max((tankWidth * tankHeight), maxArea);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}