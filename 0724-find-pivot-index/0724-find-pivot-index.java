class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        int right;
        int size = nums.length;
        for (int i=0;i<size;i++){
            if (i==0){
                int total = totalRight(1,nums);
                if (left == total){
                    return 0;
                }
            }else {
                left = totalLeft(i-1,nums);
                right = totalRight(i+1,nums);
                if (left== right){
                    return i;
                }
            }
        }
        return -1;
    }
    public int totalRight (int start,int[] array){
        int total =0;
        for (int i = start;i<array.length;i++){
            total += array[i];
        }
        return total;
    }
    public int totalLeft(int end,int[] array){
        int total =0;
        for (int i=end;0<=i;i--){
            total +=array[i];
        }
        return total;
    }
}