class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> st = new HashMap();
        HashMap<Character, Character> ts = new HashMap();

        for(int i = 0; i < s.length(); i++) {
            if(st.containsKey(s.charAt(i))){
                if(st.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }


            if(ts.containsKey(t.charAt(i))){
                if(ts.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }

            st.put(s.charAt(i), t.charAt(i));
            ts.put(t.charAt(i), s.charAt(i));
        }
        return true; 
    }
}