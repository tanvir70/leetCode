class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        return uniquePathsHelper(m - 1, n - 1, memo);
    }
    
    private int uniquePathsHelper(int m, int n, int[][] memo) {
        // Base case: If we're at the first row or first column, there's only one path
        if (m == 0 || n == 0) return 1;
        
        // If we have already computed the value for this cell, return it
        if (memo[m][n] != 0) return memo[m][n];
        
        // Move up and move left
        int upMove = uniquePathsHelper(m - 1, n, memo);
        int leftMove = uniquePathsHelper(m, n - 1, memo);
        
        // Store the result in the memo array
        memo[m][n] = upMove + leftMove;
        
        return memo[m][n];
    }
}
