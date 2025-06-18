class Solution {
    public String sortSentence(String s) {
        String [] arr = s.split(" ");
        String [] res = new String[arr.length];
        for(String words : arr){
            int len = words.length();
            int postion = words.charAt(len-1)-'1';
            res[postion] = words.substring(0,len-1);
        }
        return String.join(" ",res);
    }
}