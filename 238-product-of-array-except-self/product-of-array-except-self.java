class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix = 1; 
        int suffix = 1;
        int[] output = new int[n];

        for(int i = 0; i < n; i++){
            output[i] = prefix;
            prefix *= nums[i];
        }

        for( int i = n - 1; i >= 0; i--){
            output[i] *= suffix;
            suffix *= nums[i];
        }

        
        return output;
    }
}