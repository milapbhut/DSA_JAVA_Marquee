class Solution {
    public int maxSumSubarray(int[] arr) {
        // code here
        int n = arr.length;

        if (n == 1) return arr[0];

        int[] fw = new int[n];
        int[] bw = new int[n];

        // Forward Kadane
        fw[0] = arr[0];
        int ans = arr[0];

        for (int i = 1; i < n; i++) {
            fw[i] = Math.max(arr[i], fw[i - 1] + arr[i]);
            ans = Math.max(ans, fw[i]);
        }

        // Backward Kadane
        bw[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            bw[i] = Math.max(arr[i], bw[i + 1] + arr[i]);
        }

        // Try removing one element
        for (int i = 1; i < n - 1; i++) {
            ans = Math.max(ans, fw[i - 1] + bw[i + 1]);
        }

        return ans;
    }
}