class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        // Find elements in nums1 not present in nums2
        Set<Integer> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2);

        // Find elements in nums2 not present in nums1
        Set<Integer> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);

        // Create lists to hold the results
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(difference1));  // Convert set to list
        result.add(new ArrayList<>(difference2));

        return result;
    }
}