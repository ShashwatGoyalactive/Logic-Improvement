public class FindTheMiddleIndexInArray1991 {
//    https://leetcode.com/problems/find-the-middle-index-in-array/description/?envType=problem-list-v2&envId=prefix-sum

    class Solution {
        public int findMiddleIndex(int[] nums) {
            int n = nums.length;
            int totalSum =0;
            for(int num : nums)totalSum += num;

            int sum =0;
            for(int i=0;i<n;i++){
                if(sum == (totalSum - sum - nums[i]))return i;
                sum += nums[i];
            }
            return -1;
        }
    }
}
