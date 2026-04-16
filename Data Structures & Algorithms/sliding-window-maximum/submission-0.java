class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        int[] ans = new int[n-k+1];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> nums[b] - nums[a]);

        //first iteration : initialise pq
        for(int i=0; i<k; i++){
            pq.add(i);
        }
        ans[0] = nums[pq.peek()];

        int l = 1;
        int r = k;

        while(r < n){
            pq.add(r);
            
            while(pq.peek() < l){
                pq.poll();
            }

            ans[l] = nums[pq.peek()];

            l++;
            r++;
            
        }

        return ans;

    }
}
