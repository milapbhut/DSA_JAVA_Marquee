class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(sum == k){
                count++;
            }
            for(int j = i + 1; j < n;j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }   
            }
            sum = 0;
        }
        return count;
    }
}