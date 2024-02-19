class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;

        for(int i = 0; i < grid[0].length; i++) {
            int[] n = new int[grid[0].length];
            int s = 0;

            // Copy the elements of the i-th column into the array 'n'
            for(int[] row : grid) {
                n[s] = row[i];
                s++;
            }

            // Compare the array 'n' with each row in the grid
            for(int[] row : grid) {
                if(Arrays.equals(n, row)) {
                    count++;
                }
            }
        }

        return count;
    }
}
