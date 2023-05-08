class Solution {
    public int minPartitions(String n) {
        int len = n.length();
        char max = '0';
        for(int i = 0; i < len; i++) {
            char symbol = n.charAt(i);
            if(symbol > max) {
                max = symbol;
            }
        }
        return max - '0';
    }
}