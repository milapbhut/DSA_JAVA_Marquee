class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr = new int[m][n];
        int a = 0;
        int e = original.length;
        if(e > m * n || e < m*n){
            return new int[0][0];
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(a < e){
                    arr[i][j] = original[a];
                    a++;
                }else{
                    break;
                }
            }
        }
        return arr;
    }
}