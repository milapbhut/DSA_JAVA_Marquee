class Solution {
    public int convertFive(int n) {

        int rev = 0;
        int demo = 0;
        
        if(n == 0){
            return 5;
        }

        while (n > 0) {
            int num = n % 10;

            if (num == 0) {
                rev = rev * 10 + 5;
            } else {
                rev = rev * 10 + num;
            }

            n /= 10;
        }

        while (rev > 0) {
            int num = rev % 10;
            demo = demo * 10 + num;
            rev /= 10;
        }

        return demo;
    }
}