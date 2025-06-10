import java.util.*;

class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                minEven = Math.min(minEven, freq);
            } else {
                maxOdd = Math.max(maxOdd, freq);
            }
        }

        if (maxOdd == Integer.MIN_VALUE || minEven == Integer.MAX_VALUE) {
            return -1;
        }

        return maxOdd - minEven;
    }
}
