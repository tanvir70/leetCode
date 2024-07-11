import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }
        
        int jewelCount = 0;
        for (char stone : stones.toCharArray()) {
            if (jewelSet.contains(stone)) {
                jewelCount++;
            }
        }
        
        return jewelCount;
    }
}
