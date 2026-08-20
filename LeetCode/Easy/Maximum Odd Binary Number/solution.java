class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] ch = s.toCharArray();
        int count = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '1'){
                count++;
            }
        }
        for(int i = 0; i < ch.length; i++){
            if(i < count - 1){
                ch[i] = '1';
            }
            else{
                ch[i] = '0';
            }
        }
        ch[ch.length - 1] = '1';
        return new String(ch);
    }
}