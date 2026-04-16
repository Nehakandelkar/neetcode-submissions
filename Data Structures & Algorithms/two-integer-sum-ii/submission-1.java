class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for(int i=0; i<numbers.length; i++){
            if(!map.containsKey(target - numbers[i])){
                map.put(numbers[i], i);
            }
            else{
                res[0] = 1 + map.get(target - numbers[i]);
                res[1] = 1 + i;
            } 
        }

        return res;
    }
}
