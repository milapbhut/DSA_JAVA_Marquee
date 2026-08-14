class Solution {
    public int lengthOfLastWord(String s) {
        String sc = s.trim();
        int count = 0;
        for(int i = sc.length() - 1 ; i >= 0; i--){
            if(sc.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}