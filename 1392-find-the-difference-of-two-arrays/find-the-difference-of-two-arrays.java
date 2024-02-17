class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       Set<Integer> set1 = new HashSet<>();
       Set<Integer> set2 = new HashSet<>();

       for ( int num : nums1){
           set1.add(num);
       }
       for ( int num : nums2){
           set2.add(num);
       }

       Set<Integer> difference1 = new HashSet<>(set1);
       difference1.removeAll(set2);

       Set<Integer> difference2 = new HashSet<>(set2);
       difference2.removeAll(set1);

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(difference1));
        answer.add(new ArrayList<>(difference2));

        return answer;

    }
}