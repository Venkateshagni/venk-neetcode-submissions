class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] charArray = s.toCharArray();

        for (char chars : charArray) {
            if (!t.contains(String.valueOf(chars)))
                return false;
        }
        return true;
    }
}