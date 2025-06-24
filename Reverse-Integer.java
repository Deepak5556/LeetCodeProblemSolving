class Solution {
    public int reverse(int x) {
        boolean flag = true;
        long rev = 0;
        if (x < 0) {
            flag = false;
        }
        x = Math.abs(x);
        
        while (x > 0) {
            int rem = x % 10;  
            rev = (rev * 10) + rem;  
            x = x / 10;         
        }
        
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }
        
        if (flag) {
            return (int)rev;
        } else {
            return (int)rev * -1; 
        }
    }
}
