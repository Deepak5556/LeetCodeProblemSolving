class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){
            if(Character.isDigit(i))
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else{
                st.push(i);
            }
        }
        while(!st.isEmpty())
        {
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}