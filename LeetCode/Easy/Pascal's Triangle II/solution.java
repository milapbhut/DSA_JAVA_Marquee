class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j <= i ; j++){
                if(j == 0 || j == i){
                    temp.add(1);
                }
                else{
                    int val = arr.get(i - 1).get(j) + arr.get(i - 1).get(j - 1);
                    temp.add(val);
                }
            }
            arr.add(temp);
        }
        List<Integer> ans = new ArrayList<>();
        ans = arr.get(rowIndex);
        return ans;
    }
}