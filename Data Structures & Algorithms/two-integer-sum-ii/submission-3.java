class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        int left = 0;
        int right = numbers.length-1;

        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum < target){
                left++;
            }
            else if(sum > target){
                right--;
            }
            else{
                //equal
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }
        }

        return res;
    }
}
