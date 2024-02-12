class Solution {
    public double findMaxAverage(int[] nums, int k) {

        
        int currentSum = 0;
        for(int i = 0; i < k; i++){
            currentSum += nums[i];
        }
        int max = currentSum;

        for(int i = k; i < nums.length; i++){
            currentSum += nums[i] - nums[i - k];
            max = Math.max(max, currentSum);
        }
        return (double)max / k;
    }
}