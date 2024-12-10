class Solution {

    public int findDays(int[] weights,int capacity)
    {
        int days = 1;
        int load = 0;

        for(int i=0;i<weights.length;i++)
        {
            if(load + weights[i]>capacity)
            {
                days++;
                load = weights[i];
            }
            else
            {
                load+=weights[i];
            }
        }
        return days;
        

    }






    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = 0;

        for(int i=0;i<weights.length;i++)
        {
            sum += weights[i];
           max= Math.max(max,weights[i]);
        }

        int low = max;
        int high = sum;

        while(low<high)
        {
            int mid = (low  + high)/2;
            if(findDays(weights,mid)<= days)
            {
               high = mid;
            }
            else
            {
                low  = mid+1;
            }
        }
        return low;
       

    }
}