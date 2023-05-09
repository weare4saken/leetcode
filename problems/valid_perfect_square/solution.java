class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) {
            return true;
        }

        long l = 1L;
        long r = num / 2;

        while(l <= r) {
            long mid = (l + r) / 2;
            long sq = mid * mid;

            if(sq == num) {
                return true;
            } 
            
            if(sq < num) {
                l = mid + 1;   
            } else {
                r = mid - 1;    
            }    
        }
        return false;
    }
}