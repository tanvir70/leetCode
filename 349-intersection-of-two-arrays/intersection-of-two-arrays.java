class Solution {
    public int[] intersection(int[] arrN, int[] arrM) {
     
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> commonElements = new HashSet<>();
        
        for (int i = 0; i < arrN.length; i++) {
            set.add(arrN[i]);
        }

         for (int i = 0; i < arrM.length; i++) {
            if (set.contains(arrM[i])){
                commonElements.add(arrM[i]);
            }
        }

        int[] result = new int[commonElements.size()];
        int index = 0;
        
        for (int element : commonElements) {
            result[index++] = element;
        }
           
        return result;
    }
}
