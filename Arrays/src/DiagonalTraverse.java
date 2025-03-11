import java.util.*;
public class DiagonalTraverse {
//    https://leetcode.com/problems/diagonal-traverse/
    class Solution {
        public int[] findDiagonalOrder(int[][] mat) {
            int m = mat.length;
            if(m==0) return new int[0];
            int r=0, c=0, n = mat[0].length;
            int[] res = new int[m*n];
            for(int i=0;i<res.length;i++){
                res[i] = mat[r][c];
                if((r+c)%2==0){
                    if(c==n-1)r++;
                    else if(r==0)c++;
                    else {
                        r--;
                        c++;
                    }
                }else {
                    if(r==m-1)c++;
                    else if(c==0)r++;
                    else {
                        r++;
                        c--;
                    }
                }
            }
            return res;
        }
    }
}
