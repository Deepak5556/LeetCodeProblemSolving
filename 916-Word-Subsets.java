class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> output = new ArrayList<>();
        int maxcount[] = new int [26];
        for(String word : words2)
        {
            int[] curr = new int [26];
            for(char c : word.toCharArray())
            {
                curr[c - 'a']++;
            }
            for(int i=0;i<26;i++)
            {
                 maxcount[i]=Math.max(maxcount[i],curr[i]);
            }
        }
            for(String w1 : words1)
            {
                int[] curr = new int [26];
                for(char c  : w1.toCharArray()){
                   curr[c - 'a']++;
                 }
                 for(int i=0;i<26;i++)
                 {
                        if(maxcount[i]>curr[i])
                        {
                            break;
                        }
                        if(i==25)output.add(w1);
                 }
            }
        
        return output ; 
    }
}