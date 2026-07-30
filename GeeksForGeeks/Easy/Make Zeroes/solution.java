class Solution {

    void makeZeros(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int[][] arr = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0;j < m; j++){
                arr[i][j] = mat[i][j];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0;j < m; j++){
                int sum = 0;
                if(arr[i][j] == 0 && mat[i][j] == 0){
                    if(i > 0){
                        sum =  sum + arr[i - 1][j];
                        mat[i - 1][j] = 0;
                    }
                    if(i < n - 1){
                        sum =  sum + arr[i + 1][j];
                        mat[i + 1][j] = 0;
                    }
                    if(j > 0){
                        sum =  sum + arr[i][j - 1];
                        mat[i][j - 1] = 0;
                    }
                    if(j < m - 1){
                        sum =  sum + arr[i][j + 1];
                        mat[i][j + 1] = 0;
                    }
                    mat[i][j] = sum;
                }
            }
        }
    }
}