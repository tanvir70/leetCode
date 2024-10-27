class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        Set<Character> charSet = new HashSet<>();

        int l = 0;
        int r;

        for (r = 0; r < n; r++){
            char c = s.charAt(r);
            if (!charSet.contains(c)){
                charSet.add(c);
                maxLength = Math.max(maxLength, r - l + 1);
            }else{
                while (charSet.contains(c)){
                    charSet.remove(s.charAt(l));
                    l++;
                }
            }
            charSet.add(c);
        }
        return maxLength;
    }
}