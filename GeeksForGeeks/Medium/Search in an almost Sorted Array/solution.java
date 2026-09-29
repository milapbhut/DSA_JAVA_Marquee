class Solution {
    public int findTarget(int arr[], int target) {
        // code here
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(mid > s && arr[mid - 1] == target){
                return mid - 1;
            }
            else if(mid < e && arr[mid + 1] == target){
                return mid + 1;
            }
            else if(target > arr[mid]){
                s = mid + 2;
            }
            else{
                e = mid - 2;
            }
        }
        return -1;
    }
}