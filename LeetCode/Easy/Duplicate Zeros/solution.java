class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i < n - 1){
            if(arr[i] == 0){
                shift(arr,i + 1);
                i++;
            }
            i++;
        }
    }
    private void shift(int[] arr, int n){
        int m = arr.length;
        for(int i = m - 1; i > n; i--){
            arr[i] = arr[i - 1];
        }
        arr[n] = 0;
    }
}