class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int num : nums) {
            if(!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        int major = 0;
        int result = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > major) {
                major = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}