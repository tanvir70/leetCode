class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int frequency = 0;
        for (int num: arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> seen = new HashSet<>();
        for (Integer value: map.values()) {
            if ( seen.contains(value)){
                return false;
            }
            seen.add(value);
        }
        return true;
    }
}