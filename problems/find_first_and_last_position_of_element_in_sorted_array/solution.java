class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1, -1};

        return new int[] {
            binarySearch(nums, target, false), 
            binarySearch(nums, target, true)
        };

    }

    public static int binarySearch(int[] nums, int target, boolean desc) {
        int result = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                result = mid;
                if(desc) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

}