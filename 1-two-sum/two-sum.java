class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int sum=0;
        int res[]= new int[2];
        for (int i=0; i<nums.length-1; i++)
        {
            for (int j=i+1; j<nums.length; j++)
            {
                sum=nums[i]+nums[j];
                if (sum==target)
                {
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
        }     
        System.gc();
        return res;
    }
}