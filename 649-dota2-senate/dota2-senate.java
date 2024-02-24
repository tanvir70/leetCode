class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>(); 
        Queue<Integer> dire = new LinkedList<>();
        
        int n = senate.length();

        for ( int i = 0; i < n; i++){
            if (senate.charAt(i) == 'R'){
                rad.add(i);
            }else {
                dire.add(i);
            }
        }

        while ( !rad.isEmpty() && !dire.isEmpty()){
            if ( rad.peek() < dire.peek()){
                rad.add(n++);
            }else{
                dire.add(n++);
            }
            dire.poll();
            rad.poll();
        }
       return rad.isEmpty() ? "Dire" : "Radiant";
    
}}