class Solution {
    public boolean isMatch(char a, char b) {
        return (a == '(' && b == ')' || a == '[' && b == ']' || a == '{' && b == '}');
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int n = s.length();
        if (n < 2) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);

            if (n == 0 && (x == ')' || x == ']' || x == '}'))
                return false;

            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
            } else if (stack.isEmpty() || isMatch(stack.peek(), x) == false) {
                return false;
            } else {
                stack.pop();
            }
        }
        return (stack.isEmpty());
    }
}