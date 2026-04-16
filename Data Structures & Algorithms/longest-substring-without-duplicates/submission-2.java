class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int count = 0;
        int maxCount = 0;

        Set<Character> set = new HashSet<>();

        int l = 0;
        int r = 0;

        while (r < n) {

            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                maxCount = Math.max(maxCount, r - l + 1);
                r++;
            } 
            else {
                set.remove(s.charAt(l));
                l++;
            }
        }



        return maxCount;

    }
}
