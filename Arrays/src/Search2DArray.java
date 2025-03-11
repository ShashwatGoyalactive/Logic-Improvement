import java.util.*;
public class Search2DArray {
//    https://leetcode.com/problems/search-a-2d-matrix/description/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int i=0 , j=m-1;
        for( i=0;i<n;i++){
            if(matrix[i][j] >= target)break;
        }

        if( i< n && matrix[i][j] == target) return true;
        if(i==n)return false;
        return bs(matrix[i] ,target,  0 , j);
    }
    public boolean bs(int[] arr ,int target,  int low , int high){
        if(low >high)return false;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target)return true;
            else if (arr[mid] < target) return bs(arr ,target,  mid+1 , high);
            return bs(arr ,target,  low , mid-1);
        }
        return false;
    }
}
}
