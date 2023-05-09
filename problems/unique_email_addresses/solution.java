class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<String>();
        for(String s : emails) {
            int atIndex = s.indexOf('@');
            int plusIndex = s.indexOf('+');
            String newEmail = "";
            if(plusIndex > 0) {
                newEmail = s.substring(0, plusIndex);
            } else {
                newEmail = s.substring(0, atIndex);
            }
            newEmail = newEmail.replace(".","") + s.substring(atIndex);
            set.add(newEmail);
        }
        return set.size();
    }
}