class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();
        int res  = 0 ;
        for (String i : operations) {
            if (i.equals("D")) {
                int n = stk.peek();
                stk.push(n*2);
            } else if (i.equals("+")) {
                int n = stk.pop();
                int n1 = stk.peek();
                stk.push(n);
                stk.push(n + n1);
            } else if (i.equals("C")) {
                stk.pop();
            } else {
                stk.push(Integer.parseInt(i));
            }
        }
        while(!stk.isEmpty()){
            res+=stk.pop();
        }
        return res;
    }
}