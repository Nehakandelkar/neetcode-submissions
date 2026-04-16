class Solution {

    public String sortString(String str){
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String st = strs[i];

            String sorted_st = sortString(st);

            if(!map.containsKey(sorted_st)){
                map.put(sorted_st, new ArrayList<>());
            } 
            map.get(sorted_st).add(st);

        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            res.add(entry.getValue());
        }

        return res;
    }
}
