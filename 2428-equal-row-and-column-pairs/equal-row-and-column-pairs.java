class Solution {
    public int equalPairs(int[][] grid) {
       int count = 0;
       int n = grid[0].length;

       for (int i = 0; i < n; i++){
           int[] temp = new int[n];

           for (int j = 0; j < grid.length; j++){
               temp[j] = grid[j][i];
           }

           for(int k =0; k < grid.length; k++){
               if ( Arrays.equals(temp,grid[k])){
                   count++;
               }
           }
       }
       return count;
    }
}
