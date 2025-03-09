import java.util.*;
//https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/submissions/1567735880/
public class SubArraySizeK1343 {
    class Solution {
        public int numOfSubarrays(int[] arr, int k, int threshold) {
            int n = arr.length;

            int sum = 0;
            for(int i=0;i<k;i++){
                sum+= arr[i];
            }
            int count =0;
            int avg = sum/k;

            if(avg >= threshold)count++;

            for(int i=k;i<n;i++){
                avg = avg - (arr[i-k]/k) + (arr[i]/k);
                if(avg >= threshold)count++;

            }
            return count;
        }
    }
}
