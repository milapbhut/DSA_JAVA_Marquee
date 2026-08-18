class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) return true;
        
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            char firstChar = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }
            arr[arr.length - 1] = firstChar;
            if (new String(arr).equals(goal)) {
                return true;
            }
        }
        
        return false;
    }
}