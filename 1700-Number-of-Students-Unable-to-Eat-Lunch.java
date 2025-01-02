class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st=new Stack<>();
        Queue<Integer> qe=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            qe.add(students[i]);
        }
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        int k=0;

        while(k!=qe.size())
        {
            if(st.peek()==qe.peek())
            {
                st.pop();
                qe.remove();
                k=0;
            }
            else{
                int l=qe.remove();
                qe.add(l);
                k++;
            }
        }
        return qe.size();
    }
}