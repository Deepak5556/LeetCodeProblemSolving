class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder(s);
        int len = part.length();
        while(str.indexOf(part)!=-1){
            int val = str.indexOf(part);
            str.delete(val,val+len);
        }
        return str.toString();
    }
}