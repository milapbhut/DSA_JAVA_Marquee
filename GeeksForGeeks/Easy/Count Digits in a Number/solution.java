class Solution {
    public static int countDigits(int n) {
        // Code here
        int digits = Solution.digits(n);
        return digits;
    }
    static int digits(int n){
        int count = 0 ;
        while(n > 0){
            count = count + 1;
            n = n / 10;
        }
        return count;
    }
}
