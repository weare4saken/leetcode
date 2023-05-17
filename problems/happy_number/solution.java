class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(n != 1 && !set.contains(n)) {
            set.add(n);
            n = getSum(n);
        }
        return n == 1;
    }   

    public int getSum(int n) { 
        int sum = 0;
        while(n > 0) {
            int i = n % 10;
            n = n / 10;
            sum += i * i;
        }
        return sum;
    }
}