class Solution {
    public void generateParenthesis(List<String> list, int n, int open, int close, StringBuilder string) {
        if (n == open && n == close) {
            list.add(string.toString());
            return;
        }
        if (open < n) {
            string.append("(");
            generateParenthesis(list, n, open + 1, close, string);
            string.deleteCharAt(string.length() - 1);
        }
        if (close < open) {
            string.append(")");
            generateParenthesis(list, n, open, close + 1, string);
            string.deleteCharAt(string.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        StringBuilder string = new StringBuilder();
        List<String> list = new ArrayList<>();

        generateParenthesis(list, n, 0, 0, string);
        return list;
    }
}