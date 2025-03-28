public class SubArrayProductLessThank713 {
//    https://leetcode.com/problems/subarray-product-less-than-k/description/

    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            int n = nums.length;
            int left = 0, right = 0;
            int product = 1;
            int count = 0;
            while (right < n) {
                product *= nums[right];
                while (left < right && product >= k) {
                    product /= nums[left++];
                }
                if(product < k)
                    count += (right - left + 1);
                right++;
            }
            return count;
        }
    }
}
