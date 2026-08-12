class Solution {
    static int closestNumber(int n, int m) {
        int k = n;

        while (true) {
            if (n % m == 0 && k % m == 0) {
                return Math.abs(n) > Math.abs(k) ? n : k;
            }

            if (n % m == 0) {
                return n;
            }

            if (k % m == 0) {
                return k;
            }

            n--;
            k++;
        }
    }
}