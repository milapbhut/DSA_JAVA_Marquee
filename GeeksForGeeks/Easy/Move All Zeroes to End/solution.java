class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int j = 0;
        int[] temp = new int[n];
        
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }
        while(j < n){
            temp[j] = 0;
            j++;
        }
        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
    }
}