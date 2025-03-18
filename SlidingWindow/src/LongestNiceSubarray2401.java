import java.util.*;
public class LongestNiceSubarray2401 {
//    https://leetcode.com/problems/longest-nice-subarray/?envType=daily-question&envId=2025-03-18

    class Solution {
        public int longestNiceSubarray(int[] nums) {
            int n = nums.length;
            if(n==1)return 1;

            int left =0;
            int andValue = 0;

            int right = 0;
            int length =1;
            while( right<n){
                while((andValue & nums[right])!=0){
                    andValue ^= nums[left++];
                }
                andValue |= nums[right];
                length = Math.max(length , right -left +1);
                right++;
            }
            return length;
        }
    }
}
