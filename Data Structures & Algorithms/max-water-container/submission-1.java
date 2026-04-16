class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        int maxWater = 0;
        int water = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                water = Math.min(heights[i], heights[j]) * (j-i);
                maxWater = Math.max(maxWater, water);
            }

            
        }

        return maxWater;
    }
}
