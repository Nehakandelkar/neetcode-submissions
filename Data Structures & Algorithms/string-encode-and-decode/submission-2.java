class Solution {

    public String encode(List<String> strs) {
        String s = "";

        for(int i=0; i<strs.size(); i++){
            s = s + strs.get(i);
            s = s + '.';
        }

        return s;

    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            String temp = "";
            while(str.charAt(i) != '.'){
                temp = temp + str.charAt(i);
                i++;
            }
            res.add(temp);
        }

        return res;

    }
}
