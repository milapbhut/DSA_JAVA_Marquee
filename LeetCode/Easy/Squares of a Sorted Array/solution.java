class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] temp = new int[nums.length];
        int s = 0;
        int e = nums.length - 1;
        int k = nums.length - 1;
        while(s <= e){
            if(Math.abs(nums[s]) > Math.abs(nums[e])){
                temp[k] = nums[s] * nums[s];
                s++;

            }
            else{
                temp[k] = nums[e] * nums[e];
                e--;
            }
            k--;
            
        }
        return temp;
    }
}