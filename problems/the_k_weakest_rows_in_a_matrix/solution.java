class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[k];

        for(int i = 0; i < mat.length; i++) {
            int count = 0;
            int[] xx = mat[i];
            for(int j = 0; j < xx.length; j++) {
                if(xx[j] == 1) {
                    count++;
                }
            }
            map.put(i, count);
            list.add(count);
        }

        Collections.sort(list);
        int n = 0;
        for(int i = 0; i < k; i++) {
            for(Map.Entry<Integer, Integer> mappa : map.entrySet()) {
                if(list.get(i).equals(mappa.getValue())) {
                    arr[n++] = mappa.getKey();
                    map.remove(mappa.getKey(), mappa.getValue());
                    break;
                }
            }
        }
        return arr;
    }
}