class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        while(min < max){
            int temp = min + 1;
            int count = 0;
            for(int i = 1;i < nums.length;i++){
                if(temp == nums[i]){
                    count++;
                }
            }
            if(count == 0){
                arr.add(temp);
            }
            min++;
        }
        return arr;
    }
}