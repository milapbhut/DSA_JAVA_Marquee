class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            while(sum >= target){
                minlen = Math.min(minlen, i - l + 1);
                sum -= nums[l];
                l++;
            }
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}