class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = new HashSet<>();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
    

    int vowel = 0;

    for (int i = 0; i < k; i++){
        if(set.contains(s.charAt(i))){
            vowel++;
        }
    }

    int maxCount = vowel;

    for (int i = k; i < s.length(); i++){
        if(set.contains(s.charAt(i - k))){
            vowel--;
        }
        if(set.contains(s.charAt(i))){
            vowel++;
        }
        maxCount = Math.max(maxCount, vowel);
    }
    return maxCount;
    }
}