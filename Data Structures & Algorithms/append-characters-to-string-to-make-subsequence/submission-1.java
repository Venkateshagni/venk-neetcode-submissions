class Solution {
    public int appendCharacters(String s, String t) {
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
                if (t.charAt(j) == s.charAt(i)) {
                    j++;
                }
                if (j >= t.length()) {
                    break;
                }
        }
        return t.substring(j).length();
    }
}