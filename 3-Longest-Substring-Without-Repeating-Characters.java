
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max = 0;
        Set<Character> cset = new HashSet<>();

        while (end < s.length()) {
            char c = s.charAt(end);
           
            while (cset.contains(c)) {
                cset.remove(s.charAt(start));
                start += 1;
            }

            cset.add(c);
            int w = end - start + 1;
            max = Math.max(max, w);
            end += 1;
        }
        return max;
    }
}
