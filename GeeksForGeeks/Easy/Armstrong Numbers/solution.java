class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += Math.pow(rem,3);
            n = n / 10;
        }
        return (temp==sum);
    }
}