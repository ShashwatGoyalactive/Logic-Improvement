import java.util.*;
public class SetMatrixZero73 {
//    https://leetcode.com/problems/set-matrix-zeroes/description/
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<int[]> ans = new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    ans.add(new int[]{i,j});
                }
            }
        }

        for(int i=0;i<ans.size();i++){
            set0(matrix , ans.get(i)[0] , ans.get(i)[1]);
        }
        return;
    }


    public void set0(int[][] matrix, int row , int col){
        int m = matrix.length;
        int n = matrix[0].length;
        int i=row;
        int j=col;
        while(i>=0){
            matrix[i--][j] = 0;
        }

        i=row;
        while(i<m){
            matrix[i++][j] = 0;
        }

        i=row;
        while(j>=0){
            matrix[i][j--] =0;
        }

        j=col;
        while(j<n){
            matrix[i][j++] = 0;
        }
    }

}
}

