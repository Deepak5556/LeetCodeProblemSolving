class Solution {
    public int myAtoi(String str) {
        if (str == null)
            return 0;
        str=str.trim();
        if (str.length() == 0)
            return 0;
        int sign = +1;
        if (str.charAt(0) == '-')
            sign = -1;
        int i =0;
        i = (str.charAt(0) == '-' || str.charAt(0)=='+')?1:0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long ans = 0;
        while(i<str.length()){
            if(str.charAt(i) == ' '|| !Character.isDigit(str.charAt(i)))break;
            ans = ans*10 + str.charAt(i)-'0';
            if(sign == -1 && ans*-1<min)return min;
            if(sign == +1 && ans>max)return max;
            i++;
        }
        return (int)(sign*ans);
    }
}