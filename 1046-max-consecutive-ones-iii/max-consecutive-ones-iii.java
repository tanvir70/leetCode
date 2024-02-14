class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int zeroCount = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[right] == 0){
                zeroCount++;
            }
            right++;

            if (zeroCount > k){
                if ( nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }
        }
        return right - left;
    }
}