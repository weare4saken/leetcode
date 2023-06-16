class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich = accounts[0][0];
        for(int user[] : accounts) {
            int sum = 0;
            for(int cSum : user) {
                sum += cSum;
            }
            rich = Math.max(rich, sum);
        }
        return rich;
    }
}