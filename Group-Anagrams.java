class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();
        for (String words : strs) {
            char[] Chararray = words.toCharArray();
            Arrays.sort(Chararray);
            String w = new String(Chararray);

            if (!anagram.containsKey(w)) {
                anagram.put(w, new ArrayList<>());
            }
            anagram.get(w).add(words);
        }
        return new ArrayList<>(anagram.values());
    }
}