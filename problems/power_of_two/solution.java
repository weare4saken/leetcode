class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        } 

        double i = 0;
        double j = 0;

        while(i < n && i != n) {
            i = Math.pow(2, j);
            j++;
        }

        return i == n;
    }
}