class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[right] == 0){
                zeroCount++;
            }
            right++;
            if (zeroCount > 1){
                if (nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }
        }
        return right - left -1;
    }
}