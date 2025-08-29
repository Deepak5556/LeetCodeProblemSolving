class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-') {
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
        }
        String cleaned = sb.toString();
        sb = new StringBuilder();
        int count = 0;
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            if (count == k) {
                sb.append('-');
                count = 0;
            }
            sb.append(cleaned.charAt(i));
            count++;
        }

        String result = sb.reverse().toString();

        if (result.length() > 0 && result.charAt(0) == '-') {
            result = result.substring(1);
        }

        return result;
    }
}
