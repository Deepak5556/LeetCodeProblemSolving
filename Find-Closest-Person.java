class Solution {
    public int findClosest(int x, int y, int z) {
        int fp = Math.abs(z-x);
        int sp = Math.abs(y-z);
        if(fp==sp){
            return 0;
        }else if(fp<sp){
            return 1;
        }
        return 2;
    }
}