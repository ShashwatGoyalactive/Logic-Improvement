import java.util.*;
public class SpiralMatrix54 {
//    https://leetcode.com/problems/spiral-matrix/description/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> order = new ArrayList<Integer>();

        int lrow =0, lcol =0 , hrow = m-1 , hcol = n-1;

        while (lrow <= hrow && lcol <= hcol) {
            // Traverse from left to right
            for (int j = lcol; j <= hcol; j++) {
                order.add(matrix[lrow][j]);
            }
            lrow++;

            // Traverse from top to bottom
            for (int i = lrow; i <= hrow; i++) {
                order.add(matrix[i][hcol]);
            }
            hcol--;

            // Traverse from right to left, if there are remaining rows
            if (lrow <= hrow) {
                for (int j = hcol; j >= lcol; j--) {
                    order.add(matrix[hrow][j]);
                }
                hrow--;
            }

            // Traverse from bottom to top, if there are remaining columns
            if (lcol <= hcol) {
                for (int i = hrow; i >= lrow; i--) {
                    order.add(matrix[i][lcol]);
                }
                lcol++;
            }
        }
        return order;
    }
}
}
