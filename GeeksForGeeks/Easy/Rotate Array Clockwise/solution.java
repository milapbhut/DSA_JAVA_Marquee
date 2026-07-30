class Solution {
    public void rotateclockwise(int[] arr, int k) {
        // code here
        int n = arr.length;
        k %= n;
        
        reverse(arr,0,n - 1);
        reverse(arr,0,k - 1);
        reverse(arr,k,n - 1);
    }
    static void reverse(int[] arr,int l,int r){
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}