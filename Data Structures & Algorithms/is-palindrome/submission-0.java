class Solution {
    public boolean isPalindrome(String s) {
        s = s.replace(" ", "").toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        char[] c = s.toCharArray();
        int j = c.length - 1;
        for (int i = 0; i < c.length / 2; i++) {
            if (c[i] != c[j]) {
                return false;
            } else {
                j--;
            }
        }
        return true;
    }
}
