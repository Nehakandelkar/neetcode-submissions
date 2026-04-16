class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int l = 0;
        int r = n-1;
        
        while(l <= r){
            int mid = l + (r - l)/2;

            if(nums[mid] == target) return mid;

            //second half
            if(target > nums[mid]){
                l = mid+1;
            }

            if(target < nums[mid]){
                r = mid-1;
            }
        }

        return -1;


    }
}
