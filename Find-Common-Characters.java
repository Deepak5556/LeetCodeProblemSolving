import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> str = new ArrayList<>();
        int n = words.length;
        HashMap<Character, Integer>[] map = new HashMap[n];
        for (int i = 0; i < n; i++) {
            map[i] = new HashMap<>();
            char[] c = words[i].toCharArray();
            for (Character l : c) {
                map[i].put(l, map[i].getOrDefault(l, 0) + 1);
            }
        }
        for (Character ch : map[0].keySet()) {
            int min = map[0].get(ch);
            boolean isCommon = true;
            for (int i = 1; i < n; i++) {
                if (!map[i].containsKey(ch)) {
                    isCommon = false;
                    break;
                } else {
                    min = Math.min(min, map[i].get(ch));
                }
            }

            if (isCommon) {
                for (int i = 0; i < min; i++) {
                    str.add(String.valueOf(ch));
                }
            }
        }

        return str;
    }
}
