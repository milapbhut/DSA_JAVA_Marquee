class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        String ans = "";

        for (String word : words) {
            word = word.toLowerCase();

            if (word.length() <= 2) {
                ans += word;
            } else {
                ans += Character.toUpperCase(word.charAt(0));
                ans += word.substring(1);
            }

            ans += " ";
        }

        return ans.trim();
    }
}