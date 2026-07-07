class Solution {
    public static boolean validPalindrome(String s) {
        s = s.toLowerCase();
        int length = s.length();

        int left = 0;
        int right = length - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
                continue;
            }

            return isValidPalindrome(s, left + 1, right) || isValidPalindrome(s, left, right - 1);
        }
        return true;
    }

    static boolean isValidPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}