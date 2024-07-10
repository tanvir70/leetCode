class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];  // Initialize max to the first element
        int sum = nums[0];  // Initialize sum to the first element
        
        for (int i = 1; i < nums.length; i++) {  // Start loop from the second element
            sum = Math.max(nums[i], sum + nums[i]);  // Update sum to be the maximum of the current element or current element + sum
            max = Math.max(max, sum);  // Update max to be the maximum of max and sum
        }
        return max;  // Return the maximum subarray sum found
    }
}
