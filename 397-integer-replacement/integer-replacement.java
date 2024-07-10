import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();
    
    public int integerReplacement(int n) {
        // Handle the edge case where n is Integer.MAX_VALUE
        if (n == Integer.MAX_VALUE) {
            return 32;  // Since Integer.MAX_VALUE is 2^31 - 1, it takes 32 steps to reduce it to 1
        }
        
        return integerReplacementHelper(n);
    }
    
    private int integerReplacementHelper(int n) {
        if (n == 1) {
            return 0;
        }
        
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        int count;
        if (n % 2 == 0) {
            count = 1 + integerReplacementHelper(n / 2);
        } else {
            int increment = 1 + integerReplacementHelper(n + 1);
            int decrement = 1 + integerReplacementHelper(n - 1);
            count = Math.min(increment, decrement);
        }
        
        memo.put(n, count);
        return count;
    }
}
