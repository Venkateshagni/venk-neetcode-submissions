class Solution {
    public int appendCharacters(String s, String t) {
       int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < t.length() - 1) {
                if (t.charAt(j) == s.charAt(i)) {
                    j++;
                }
            }
        }
        if (j >= t.length() - 1)
            return 0;
        else
            return t.substring(j).length();
    }
}