class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> stack = new Stack<>();

        for( int asteroid : asteroids){
            while (!stack.empty() && stack.peek() > 0 && asteroid < 0){
                int top = stack.pop();

                if(Math.abs(top) == Math.abs(asteroid)){
                    asteroid = 0;
                    break;
                }else if (Math.abs(top) > Math.abs(asteroid)){
                    stack.push(top);
                     asteroid = 0;
                    break;
                }

            }
            if (asteroid != 0){
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--){
            result[i] = stack.pop();
        }

        return result;

    }
}