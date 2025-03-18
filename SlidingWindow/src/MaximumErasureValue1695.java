import java.util.*;
public class MaximumErasureValue1695 {
//    https://leetcode.com/problems/maximum-erasure-value/description/
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int maxSum = 0, currSum = 0, start = 0;

        for (int num : nums) {
            while (seen.contains(num)) {
                seen.remove(nums[start]);
                currSum -= nums[start];
                start++;
            }

            seen.add(num);
            currSum += num;
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
}
