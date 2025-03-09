import java.util.*;
public class MaximumScorefromSubarrayMinimums {
//    https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=max-sum-in-sub-arrays

    class Solution {
        // Function to find pair with maximum sum
        public int pairWithMaxSum(int arr[]) {
            // Your code goes here
            int n = arr.length;

            if(n<2)return 0;

            int score = Integer.MIN_VALUE;
            for(int i=1;i<n;i++){
                score = Math.max(arr[i] + arr[i-1] , score);
            }
            return score;
        }
    }

}
