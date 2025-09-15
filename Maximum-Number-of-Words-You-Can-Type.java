class Solution {
    public boolean checkType(String word,String brokenLetters){
        char[] wordarr = word.toCharArray();
        char[] blarr = brokenLetters.toCharArray();
        for(int i = 0;i<wordarr.length;i++){
            for(int j = 0 ; j<blarr.length;j++){
                if(wordarr[i]==blarr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        for(String word : words){
            if(!checkType(word , brokenLetters)){
                count++;
            }
        }
        return count;
    }
}