class Solution {
    public String toggleCase(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ans += (char)(ch - 32);
            } else {
                ans += (char)(ch + 32);
            }
        }

        return ans;
    }
}