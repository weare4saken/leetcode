class Solution {
    public boolean isPalindrome(int x) {
        String current = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        String invertString = sb.append(current).reverse().toString();
        return current.equals(invertString);
    }
}