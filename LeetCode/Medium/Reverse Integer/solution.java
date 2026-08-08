class Solution {
    public int reverse(int x) {
        long rev = 0;
        int n = Math.abs(x);
        while(n > 0){
            int num = n % 10;
            rev = (rev * 10) + num;
            n = n / 10;
        }
        if(x < 0){
            rev = 0 - rev;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}