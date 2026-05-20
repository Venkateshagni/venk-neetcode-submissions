class Solution {
    public int scoreOfString(String s) {
        char[] charArray = s.toCharArray();
        int sum = 0;

        if (s.length() >= 2) {
            for (int i = 1; i < charArray.length; i++) {
                int a = (int) charArray[i];
                int b = (int) charArray[i - 1];
                int diff = Math.abs(a - b);
                sum += diff;
            }
        }
        return sum;
    }
}