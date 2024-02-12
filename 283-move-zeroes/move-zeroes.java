class Solution {
    public void moveZeroes(int[] nums) {
        int indexPointer = 0;

        for( int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
               nums[indexPointer] = nums[i];
               indexPointer++;
            }
        }
        for ( int i = indexPointer; i < nums.length; i++){
            nums[i] = 0;
        }

    }
}