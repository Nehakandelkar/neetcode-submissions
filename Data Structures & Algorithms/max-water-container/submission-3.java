class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        int maxWater = 0;
        int water = 0;

        int l = 0;
        int r = n-1;

        while(l<r){
            water = Math.min(heights[l], heights[r]) * (r-l);
            if(heights[l] < heights[r]) l++;
            else if(heights[r] < heights[l]) r--;
            else{
                l++;
                r--;
            }

            maxWater = Math.max(maxWater, water);
        }

        return maxWater;
    }
}
