public class RangeSumQuery2DImmutable304 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
//    https://leetcode.com/problems/range-sum-query-2d-immutable/description/
class NumMatrix {
    private int[][] mat;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        this.mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = matrix[i][j];
            }
        }

        rowPrefix(mat);
        colPrefix(mat);
    }

    private void rowPrefix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (j > 0) {
                    mat[i][j] += mat[i][j - 1];
                }
            }
        }

    }

    private void colPrefix(int[][] mat) {
        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length; i++) {
                if (i > 0) {
                    mat[i][j] += mat[i - 1][j];
                }
            }
        }

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int val = mat[row2][col2];
        if (row1 > 0) {
            val -= mat[row1 - 1][col2];
        }
        if (col1 > 0) {
            val -= mat[row2][col1 - 1];
        }
        if (row1 > 0 && col1 > 0) {
            val += mat[row1 - 1][col1 - 1];
        }
        return val;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
}