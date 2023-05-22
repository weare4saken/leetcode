class Solution {
    public int dominantIndex(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i : nums) {
            list.add(i);
        }

        int max = Collections.max(list);

        Arrays.sort(nums);

        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] != max && nums[i] * 2 > max) {
                return -1;
            }
        }
        return list.indexOf(max);
    }
}