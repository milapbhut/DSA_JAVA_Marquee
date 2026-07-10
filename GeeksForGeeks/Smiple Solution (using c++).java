class Solution {
    public int maxPoint(int k, int[] arr1, int[] arr2) {
        // code
        int sum = 0;
        int max = 0;
        for(int i = 0; i < arr1.length ; i++){
            int demo = k / arr1[i];
            sum = demo * arr2[i];
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
}