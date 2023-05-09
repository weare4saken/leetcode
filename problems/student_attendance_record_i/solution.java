class Solution {
    public boolean checkRecord(String s) {
        int a = 0;
        for(char x : s.toCharArray()) {
            if(x == 'A') a++;
        }
        if(a < 2 && !s.contains("LLL")) {
            return true;
        }
        return false;
    }
}