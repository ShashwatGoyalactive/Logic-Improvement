import java.util.*;

public class DivideArrayIntoEqualPairs2206 {
//    https://leetcode.com/problems/divide-array-into-equal-pairs/description/?envType=daily-question&envId=2025-03-17

    class Solution {
        public boolean divideArray(int[] nums) {
            HashMap<Integer, Integer> count = new HashMap<>();

            for (int num : nums) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }

            for (int val : count.values()) {
                if (val % 2 != 0)
                    return false;
            }
            return true;
        }
    }
}
