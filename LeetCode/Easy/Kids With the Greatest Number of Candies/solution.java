class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int n = candies.length;
        int max = candies[0];
        for(int i = 1; i < n ;i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(candies[i] + extraCandies >= max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;
    }
}