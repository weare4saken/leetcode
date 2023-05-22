class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i += 2 * k) {
            int j = Math.min(i + k, s.length());
            StringBuilder reverse = new StringBuilder(s.substring(i, j));
            reverse.reverse();
            sb.append(reverse);
            int h = Math.min(i + 2 * k, s.length());
            sb.append(s.substring(j, h));
        }
        return sb.toString();
    }
}