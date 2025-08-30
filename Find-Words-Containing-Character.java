class Solution {

    public boolean isValid(String word, char x) {
        char[] arr = word.toCharArray();
        boolean check = false;
        for (char i : arr) {
            if (i == x) {
                check = true;
                return check;
            }
        }
        return check;
    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (isValid(words[i], x)) {
                lst.add(i);
            }
        }
        
        return lst;
    }
}