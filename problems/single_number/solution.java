class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int result = nums[nums.length - 1];
        for(int i = 0; i < nums.length - 1; i = i + 2) {
            if(nums[i] != nums[i + 1]) {
                result = nums[i];
                return result;
            }
        }
        return result;
    }
}