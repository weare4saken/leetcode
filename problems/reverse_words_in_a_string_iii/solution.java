class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder resultStr = new StringBuilder();
        for(String word : arr) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            resultStr.append(sb).append(" ");
        }
        return resultStr.toString().trim();
    }
}