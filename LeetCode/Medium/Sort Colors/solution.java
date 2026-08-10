class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length - 1;
        while (m <= h) {
            if (nums[m] == 0) {
                int tmp = nums[l];
                nums[l] = nums[m];
                nums[m] = tmp;

                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else {
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;

                h--;
            }
        }
    }
}