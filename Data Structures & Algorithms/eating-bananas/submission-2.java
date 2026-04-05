class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         long left = 1,
                right = Arrays.stream(piles).max().getAsInt(),
        res = 1;

        for(long speed = left; speed <= right; speed++){
            long totalTime = 0;
            for(int pile : piles){
                totalTime += (int) Math.ceil((double) pile/ speed);
            }

            if(totalTime <= h) return (int) speed;
            res = speed;
        }


        return (int)res;
    }
}
