class Solution {
    private HashMap<Integer,Integer> memo = new HashMap<>();
    public int integerReplacement(int n) {
        if (n == Integer.MAX_VALUE){
            return 32;
        }

        return helper(n);
    }

    private int helper(int n){
        if (n == 1){
            return 0;
        }

        if (memo.containsKey(n)){
            return memo.get(n);
        }
        
        int count = 0;
      
        if ( n % 2 == 0){
           count = 1 + helper(n / 2);
        }else {
            int dif1 = 1 + integerReplacement(n + 1);
            int dif2 = 1 + integerReplacement(n - 1) ;
            count = Math.min(dif1,dif2);
        }

        memo.put(n,count);
        return count;
    }
}