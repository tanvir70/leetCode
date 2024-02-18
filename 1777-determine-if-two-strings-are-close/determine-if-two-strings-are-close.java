class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false; // If the lengths are different, they can't be made close
        }

        char[] frq1 = new char[26];
        char[] frq2 = new char[26];

        for( char ch : word1.toCharArray()){
            frq1[ch - 'a']++;
        }
        
        for( char ch : word2.toCharArray()){
            frq2[ch - 'a']++;
        }

        for ( int i = 0; i < 26; i++){
            if (frq1[i] == 0 && frq2[i] != 0 || frq2[i] == 0 && frq1[i] != 0){
                return false;
            }
        }
        Arrays.sort(frq1);
        Arrays.sort(frq2);

        for ( int i = 0; i < 26; i++){
            if (frq1[i] !=frq2[i] ) {
                return false;
            }
        }
        return true;
    }
}