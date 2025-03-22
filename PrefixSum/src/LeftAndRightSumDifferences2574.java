public class LeftAndRightSumDifferences2574 {
//    http://leetcode.com/problems/left-and-right-sum-differences/description/?envType=problem-list-v2&envId=prefix-sum

    class Solution {
        public int[] leftRightDifference(int[] nums) {
            int n = nums.length;

            int[] leftSum = new int[n];
            int[] rightSum = new int[n];

            for (int i = 1; i < n; i++) {
                leftSum[i] = leftSum[i - 1] + nums[i - 1];
            }

            for (int i = n - 2; i >= 0; i--) {
                rightSum[i] = rightSum[i + 1] + nums[i + 1];
            }

            int[] result = new int[n];

            for (int i = 0; i < n; i++) {
                result[i] = Math.abs(leftSum[i] - rightSum[i]);
            }
            return result;
        }
    }
}
