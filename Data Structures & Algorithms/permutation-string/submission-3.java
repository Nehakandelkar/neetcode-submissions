class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if(n1 > n2) return false;

        Map<Character, Integer> map = new HashMap<>();

        //1. create freqnency map for s1
        for(int i=0; i<n1; i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
        }

        //then loop in s2
         int l = 0;
        int count = n1;

        for (int r = 0; r < n2; r++) {

            char rc = s2.charAt(r);

            if (map.containsKey(rc)) {
                if (map.get(rc) > 0) {
                    count--;
                }
                map.put(rc, map.get(rc) - 1); // always decrement
            }

            // check if permutation found
            if (count == 0) return true;

            // maintain window size
            if (r - l + 1 == n1) {
                char lc = s2.charAt(l);

                if (map.containsKey(lc)) {
                    map.put(lc, map.get(lc) + 1);
                    if (map.get(lc) > 0) {
                        count++;
                    }
                }

                l++;
            }
        }
        

        return false;


    }
}
