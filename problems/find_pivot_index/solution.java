class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0) {
            return -1;
        }

        int lSum = 0;
        int rSum = 0;

        for(int num : nums) {
            rSum += num;
        }

        for(int i = 0; i < nums.length; i++) {
            rSum -= nums[i];
            if(rSum == lSum) {
                return i;
            }
            lSum += nums[i];
        }
        return -1;
    }
}