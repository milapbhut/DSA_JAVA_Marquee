class Solution {
    void booleanMatrix(int mat[][]) {
        // code here
        int n = mat.length;
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[n];
        for(int i = 0; i < n; i++){
            for(int j = 0;j < n; j++){
                if(mat[i][j] == 1){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0;j < n; j++){
                if(row[i] == true || col[j] == true){
                    mat[i][j] = 1;                    
                }
            }
        }
    }
}