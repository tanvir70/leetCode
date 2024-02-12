class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;

        int max = 0;

        while (i < j){
            int l = j - i;
            int h = 0;

            if ( height[i] < height[j]){
                 h = height[i];
                i++;
            }else{
                h = height[j];
                j--;
            }

            int area = l * h;

            if ( area > max){
                max = area;
            }

        }
        return max;
    }
}