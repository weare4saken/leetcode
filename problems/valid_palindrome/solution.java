class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.replaceAll("[^a-zA-ZА-Яа-я0-9]", "").toLowerCase();
        String sb = new StringBuilder(newS).reverse().toString();
        return sb.equals(newS);
    }
}