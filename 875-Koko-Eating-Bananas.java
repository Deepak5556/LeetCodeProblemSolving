class Solution {

    public int maxx(int[] piles){
        int maximum=Integer.MIN_VALUE;
        int len=piles.length;
        for(int i=0;i<len;i++)
        {
            if(maximum<piles[i])
            {
                maximum = piles[i];
            }
        }
        return maximum;

    }

    public int Bananas(int [] piles , int h)
    {
        int t=0;
        for(int i=0;i<piles.length;i++)
        {
            t+=Math.ceil((double)(piles[i])/(double)(h));

        }
        return t;
    }



    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
       int high=maxx(piles);
        while(low<=high)
        {
            int mid= (low+high)/2;
            int total = Bananas(piles,mid);
            if(total<=h)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }

}