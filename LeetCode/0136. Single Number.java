class Solution {
    public int singleNumber(int[] nums) {
        int rev = 0;
        for(int i = 0; i < nums.length ; i++){
            rev = rev ^ nums[i];        
        }
        return rev;
    }
}