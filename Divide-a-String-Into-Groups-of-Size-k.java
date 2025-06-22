class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int len = (n + k - 1) / k;
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            StringBuilder group = new StringBuilder();
            for (int j = 0; j < k; j++) {
                int index = i * k + j;
                if (index < n) {
                    group.append(s.charAt(index));
                } else {
                    group.append(fill);
                }
            }
            arr[i] = group.toString();
        }

        return arr;
    }
}