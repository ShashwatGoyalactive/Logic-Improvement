import java.util.*;
public class RotateImage48 {
//    https://leetcode.com/problems/rotate-image/description/
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        int i=0;
        int j=n-1;

        while(i<j){
            for(int k=0;k<n;k++){
                int temp = matrix[k][j];
                matrix[k][j] = matrix[k][i];
                matrix[k][i] = temp;
            }
            i++;
            j--;
        }

    }
}
}
