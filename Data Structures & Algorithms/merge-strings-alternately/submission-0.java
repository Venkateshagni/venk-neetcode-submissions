class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        if (word1.length() > word2.length()) {
            sb.append(word1.substring(word2.length()));
            for (int i = 0; i < word2.length(); i++) {
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
        } else {
            sb.append(word2.substring(word1.length()));
            for (int i = 0; i < word1.length(); i++) {
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
        }
        return result.append(sb).toString();
    }
}