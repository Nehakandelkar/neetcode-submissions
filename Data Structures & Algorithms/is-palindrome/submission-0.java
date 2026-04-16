class Solution {
    public boolean isPalindrome(String s) {
        String p = s.toLowerCase();
        String t = "";

        for(int i=0; i<s.length(); i++){
            if(p.charAt(i) != ' ' && Character.isLetterOrDigit(p.charAt(i))){
                t = t + p.charAt(i);
            }
        }

        int l = 0;
        int r = t.length() -1;

        while(l < r){
            if(t.charAt(l) != t.charAt(r)) return false;
            l++;
            r--;
        }

        return true;
    }
}
