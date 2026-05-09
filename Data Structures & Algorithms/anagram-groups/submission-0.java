class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            anagrams.computeIfAbsent(sorted, k -> new LinkedList<>()).add(str);
        }
        List<List<String>> result = new ArrayList<>();

        for (List<String> anagramList : anagrams.values()) {
            result.add(new ArrayList<>(anagramList));
        }
        return result;
    }
}
