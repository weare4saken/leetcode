class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mapMag = new HashMap<>();
        Map<Character, Integer> mapRansNote = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++) {
            mapMag.put(magazine.charAt(i), mapMag.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++) {
            mapRansNote.put(ransomNote.charAt(i), mapRansNote.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }

        for(char ch : mapRansNote.keySet()) {
            Integer n = mapRansNote.get(ch);
            if(mapMag.get(ch) == null || mapMag.get(ch) < n) {
                return false;
            }
        }
        return true;
    }
}
    