public class MaxConsecutiveOnesIII1004 {
//    https://leetcode.com/problems/max-consecutive-ones-iii/description/
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;

        int left =0, right =0, maxLength =0;
        int zeroCount =0;
        for(right=0; right< n;right++){
            if(nums[right] ==0){
                zeroCount++;
            }

            while(zeroCount >k){
                if(nums[left] ==0){
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength , right - left +1);

        }
        return maxLength;
    }
}
}
