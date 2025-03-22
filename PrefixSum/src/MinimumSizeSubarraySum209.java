public class MinimumSizeSubarraySum209 {
//    https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=problem-list-v2&envId=prefix-sum
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;

        int size =Integer.MAX_VALUE;
        int i=0 , j=0;
        int sum =0;
        while(j <n){
            sum += nums[j];
            if(sum >= target){
                size = Math.min(size , j-i+1);
            }
            while(i<=j && sum >= target){
                sum -= nums[i];
                size = Math.min(size , j-i+1);
                i++;
            }
            j++;
        }

        return size == Integer.MAX_VALUE ? 0 : size;
    }
}
}
