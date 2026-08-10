class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (checkMat(mat, target))
                return true;
            rotate(mat);
        }
        return false;
    }

    private void rotate(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    continue;
                } else {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int s = 0;
            int e = n - 1;
            while (e > s) {
                int temp = mat[i][s];
                mat[i][s] = mat[i][e];
                mat[i][e] = temp;
                s++;
                e--;
            }
        }
    }

    private boolean checkMat(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}