class Solution {
    public boolean checkVowel(Character c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0;i<s.length();i++){
             char letter =s.charAt(i);
            if(checkVowel(letter)){
               vowel = Math.max(vowel,map.get(letter));
            }else{
                consonant = Math.max(consonant,map.get(letter));
            }
        }
        return vowel+consonant;
    }
}