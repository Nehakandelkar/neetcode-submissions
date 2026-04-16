class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        int l = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int r = 0; r < n; r++) {

            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(c));

            while ((r - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;

    }
}
