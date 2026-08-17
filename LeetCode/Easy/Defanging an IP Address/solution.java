class Solution {
    public String defangIPaddr(String address) {
        String s = "";
        int n= address.length();
        for(int i = 0; i < n; i++){
            char ch = address.charAt(i);
            if(ch == '.'){
                s += "[.]";
            }
            else{
                s += ch;
            }
        }
        return s;
    }
}