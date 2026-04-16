class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int lo = 0;
        int hi = n-1;
        int row = -1;

        while(lo <= hi){
            int mid = lo + (hi-lo)/2;

            if(target < matrix[mid][0]){
                hi = mid-1;
            }
            else if(target > matrix[mid][m-1]){
                lo = mid+1;
            }
            else{
                row = mid;
                break;
            }
        }

        if(row == -1) return false;

        int l = 0;
        int r = m-1;

        while(l <=r){
            int mid = l + (r-l)/2;

            if(matrix[row][mid] == target) return true;

            if(target > matrix[row][mid]){
                l= mid+1;
            }
            else{
                r = mid-1;
            }
        }

        return false;

        

    }
}
