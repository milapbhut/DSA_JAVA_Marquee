class Solution {
    public String interpret(String command) {
        String s = command.replace("()","o");
        String ans = s.replace("(al)","al");
        return ans;
    }
}