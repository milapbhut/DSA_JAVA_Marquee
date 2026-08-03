class Solution {
    static boolean isPrime(int n) {
        // code here
        int count = 0;
        if(n == 1){
            return false;
        }
        for(int i = 2; i < n / 2; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 0){
            return true;
        }
        return false;
    }
}