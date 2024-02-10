class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int count = 0;

        for ( int i = 0; i < flowerbed.length; i++){
            if (flowerbed[i] == 0){
                int previous;
                if ( i == 0 ){
                    previous = 0;
                } else {
                    previous = flowerbed[i - 1];
                }
                int next;

                if ( i == flowerbed.length - 1){
                    next = 0;
                }else {
                    next = flowerbed[i + 1];
                }

                if ( previous == 0 && next == 0){
                    flowerbed[i] = 1;
                    count++;
                    i++;
                }

            }
        }

        return count >= n;

    }
}
