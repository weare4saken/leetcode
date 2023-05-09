class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double maxAverage = Integer.MIN_VALUE;
        double sum = 0;
        double currentAverage = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(i >= k - 1) {
                currentAverage = sum / k;
                maxAverage = Math.max(maxAverage, currentAverage);
                sum -= nums[i - (k - 1)];
            }
        }
        return maxAverage;
    }
}