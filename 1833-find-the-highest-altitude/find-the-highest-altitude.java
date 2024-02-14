class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
         int currentSum = 0;

        for (int altitudeGain : gain) {
            currentSum += altitudeGain;
            maxAltitude = Math.max(maxAltitude, currentSum);
        }
        return maxAltitude;
    }
}