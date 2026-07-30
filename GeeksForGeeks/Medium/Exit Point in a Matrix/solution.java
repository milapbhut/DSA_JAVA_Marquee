class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        int d = 0;
        int n = mat.length;
        int m = mat[0].length;
        while(true){
            if(mat[i][j] == 1){
                d = (d + 1) % 4;
                mat[i][j] = 0;
            }
            if(d == 0) j++;
            if(d == 1) i++;
            if(d == 2) j--;
            if(d == 3) i--;
            if(i < 0){
                i++;
                arr.add(i);
                arr.add(j);
                break;
            }
            if(i >= n){
                i--;
                arr.add(i);
                arr.add(j);
                break;
            }
            if(j < 0){
                j++;
                arr.add(i);
                arr.add(j);
                break;
            }
            if(j >= m){
                j--;
                arr.add(i);
                arr.add(j);
                break;
            }
        }
        return arr;
    }
}