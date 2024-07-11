class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] indexS = new int[26];
        int[] indexT = new int[26];
        
        // Initialize last occurrence indices arrays
        for (int i = 0; i < s.length(); i++) {
            indexS[s.charAt(i) - 'a'] = i;
            indexT[t.charAt(i) - 'a'] = i;
        }
        
        // Calculate permutation difference
        int difference = 0;
        for (int i = 0; i < 26; i++) {
            difference += Math.abs(indexS[i] - indexT[i]);
        }
        
        return difference;
    }
}