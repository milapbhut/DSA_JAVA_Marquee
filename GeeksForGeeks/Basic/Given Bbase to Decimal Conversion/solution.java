class Solution {
    public int decimalEquivalent(String s, int b) {
        String num = s.toUpperCase();
        int base = b;
        int value = 0;
        
        for(int i = 0; i < num.length(); i++){
            char c = num.charAt(i);
            int decimal = 0;
            
            if(c >= '0' && c <= '9'){
                decimal = c - '0';
            }
            else if(c >= 'A' && c <= 'F'){
                decimal = c - 'A' + 10;
            }
            else{
                System.out.println("Invalid Character : " + c);
                return -1;
            }
            
            value = (value * base) + decimal;
        }
        return value;
    }
}