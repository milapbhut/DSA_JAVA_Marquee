class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        boolean result = true;
        for(int i = 0; i < n; i++){
            char ch1 = word.charAt(i);
            if(i != 0 && Character.isUpperCase(ch1)){
                char ch2 = word.charAt(i - 1);
                if(Character.isLowerCase(ch2)){
                    result = false;
                }
            }
            if(i > 1 && Character.isLowerCase(ch1)){
                char ch2 = word.charAt(i - 1);
                if(Character.isUpperCase(ch2)){
                    result = false;
                }
            }
        }
        return result;
    }
}