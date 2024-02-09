class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         
         List<Boolean> list = new ArrayList<>();

         int max = 0;
       
         for( int i = 0; i < candies.length; i++){
             max = Math.max(max,candies[i]);
         }  
            for( int j = 0; j < candies.length; j++){
            if ( candies[j] + extraCandies < max ){
                 list.add(false);
            } else {
                list.add(true);
            }       
                
         }
          return list;
         }
        
    }
