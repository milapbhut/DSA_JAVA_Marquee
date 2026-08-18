class Solution {
    public String largestOddNumber(String num) {
        for(int i = num.length() - 1; i >= 0; i--){
            char dig = num.charAt(i);
            if(dig % 2 != 0){
                return num.substring(0,i + 1); 
            }
        }
        return "";
    }
}