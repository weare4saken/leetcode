class Solution {
    public int minimumRounds(int[] a) {
        HashMap <Integer, Integer> a1 = new HashMap<>();
        for (int i : a) {
        a1.put(i, a1.getOrDefault(i,0) +1);
        }
        int count = 0;
        for (Integer value : a1.values()) {
            if (value < 2) {
                return -1;
            }
           do {
                if ((value % 3 == 0)) {
                    count += value / 3;
                    value = 0;
                } else {
                count ++;
                value = value - 2;
                }
            } while (value !=0);
        }
        return count;
    }
}