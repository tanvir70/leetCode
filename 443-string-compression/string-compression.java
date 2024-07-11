class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n <= 1) return n;
        
        int write = 0;
        int read = 0;
        
        while (read < n) {
            char currentChar = chars[read];
            int count = 0;
            
            // Count consecutive occurrences of currentChar
            while (read < n && chars[read] == currentChar) {
                read++;
                count++;
            }
            
            // Write the character
            chars[write++] = currentChar;
            
            // Write count as characters if greater than 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        
        return write;
    }
}
