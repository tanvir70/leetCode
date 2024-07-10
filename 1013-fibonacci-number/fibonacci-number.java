class Solution {
    public int fib(int n) {
        // Use a HashMap to cache the computed Fibonacci numbers
        Map<Integer, Integer> cache = new HashMap<>();
        cache.put(0, 0); // Base case: fib(0) = 0
        cache.put(1, 1); // Base case: fib(1) = 1
        
        return findFib(n, cache);
    }

    private int findFib(int n, Map<Integer, Integer> cache) {
        // Check if the value is already cached
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        // Compute the Fibonacci number and cache it
        int fibN = findFib(n - 1, cache) + findFib(n - 2, cache);
        cache.put(n, fibN);
        
        return fibN;
    }
    }