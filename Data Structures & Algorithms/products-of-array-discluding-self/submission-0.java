class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] output = new int[nums.length];
        int numZeroes = 0;
        int product = 1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                numZeroes+=1;
            }
            else{
                product = product * nums[i];
            }

        }
        
        //egde case where there are more than one zeroes in the array
        if(numZeroes > 1) return output;

        //edge case where numZeroes = 1
        if(numZeroes == 1){
            for(int i=0; i<nums.length; i++){
                if(nums[i] == 0){
                    output[i] = product;
                }
            }
            return output;
        }

        //normal case
        if(numZeroes == 0){
            for(int i=0; i<nums.length; i++){
                output[i] = product/nums[i];
            }
        }

        return output;

    }
}  
