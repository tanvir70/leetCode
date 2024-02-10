class Solution {
    public String mergeAlternately(String word1, String word2) {
        String output = "";

        int l1 = word1.length();
        int l2 = word2.length();

        int l = Math.min(l1,l2);

        for ( int i = 0; i < l; i++){
            output += word1.charAt(i);
            output += word2.charAt(i);
        } 
        output += word1.substring(l);
            output += word2.substring(l);
        return output;  
    }
    
}