class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        Arrays.sort(piles);

        int lo = 1;
        int hi = piles[n-1];

        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            double sum = 0;

            //calculate sum for k = mid
            for(int i=0; i<n; i++){
                sum = sum + Math.ceil((double)piles[i]/mid);
            }

            if(sum > h){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }

        }

        return lo;
        
    }
}
