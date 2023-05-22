class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() <= 2) {
                String t = arr[i].toLowerCase();
                sb.append(t).append(" ");
            } else {
                String r = arr[i].substring(0, 1).toUpperCase() + 
                            arr[i].substring(1).toLowerCase();
                sb.append(r).append(" ");
            }
        }

        return sb.toString().trim();
    }
}