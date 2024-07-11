class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            if (nums[left] == target && start == -1) {
                start = left;
            }
            if (nums[right] == target && end == -1) {
                end = right;
            }
            if (start != -1 && end != -1) {
                break;
            }
            if (start == -1) {
                left++;
            }
            if (end == -1) {
                right--;
            }
        }
        
        return new int[]{start, end};
    }
}
