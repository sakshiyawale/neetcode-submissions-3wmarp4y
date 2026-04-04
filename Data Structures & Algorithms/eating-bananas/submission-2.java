class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int start = 1, end = Arrays.stream(piles).max().getAsInt();
        int res = end;

        while (start <= end){
            int k = (start + end) / 2;
            long totalTime = 0;

            for (int pile : piles) {
                totalTime += (int) Math.ceil((double) pile / k);
            }
            if (totalTime <= h){
                end = k - 1;
                res = k;
            } else {
                start = k + 1;
            }
        }

        return res;
        
    }
}
