class Solution {
    public boolean increasingTriplet(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        int secondMinVal = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= minVal) {
                minVal = num;
            } else if (num <= secondMinVal) {
                secondMinVal = num;
            } else {
                return true; // Found an increasing triplet
            }
        }

        return false; 
    }
}