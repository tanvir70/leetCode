class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
         int currentSum = 0;

        for(int i = 0; i < gain.length; i++){
            currentSum += gain[i];
            if (currentSum > maxAltitude){
                maxAltitude = currentSum;
            }
        }
        return maxAltitude;
    }
}