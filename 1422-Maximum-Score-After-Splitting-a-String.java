class Solution {
    public int maxScore(String s) {
        char[] cc=s.toCharArray();
        int n = cc.length;
        int max=0;
        int lcount=0;
        int rcount=0;
        for(int i=0;i<n;i++){
            if(cc[i]=='1')
            {
                rcount++;
            }
        }
        for(int i=0;i<n-1;i++){
                if(cc[i]=='0')lcount++;
                else rcount--;
            max=Math.max(max,lcount+rcount);
        }
        return max;
    }
}