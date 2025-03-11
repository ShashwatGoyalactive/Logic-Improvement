import java.util.*;
public class LuckyNumber1380 {
//    https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
class Solution {
    public List<Integer> luckyNumbers (int[][] arr) {
        List<Integer> luckynum =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int min = minFind(arr[i]);
            for (int j = 0; j < arr[0].length; j++) {
                int max = maxFind(arr , j);
                if (max == min ){
                    luckynum.add(max);
                }else continue;
            }
        }
        return luckynum;
    }
    public int maxFind(int[][]arr , int j){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i][j])
                max =arr[i][j];
        }
        return max;
    }
    public int minFind(int[]arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
                min =arr[i];
        }
        return min;
    }
}
}
