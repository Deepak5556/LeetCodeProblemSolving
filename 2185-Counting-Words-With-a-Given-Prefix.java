class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int count = 0;
        for(String i:words)
        {
            if(i.startsWith(pref))
            {
                count++;
            }
        }    
        return count;    
    }
}