import java.util.*;

public class MajorityElementsII229 {
//    https://leetcode.com/problems/majority-element-ii/description/
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> majority = new ArrayList<>();

        int candidate1 = 0;
        int count1 = 0;

        int candidate2 = 0;
        int count2 =0;

        for (int j = 0; j < n; j++) {

            if (count1 == 0 && candidate2 != nums[j]) {
                candidate1 = nums[j];
                count1 = 1;
            }
            else if (count2 == 0 && candidate1 != nums[j]) {

                candidate2 = nums[j];
                count2 = 1;

            }
            else if (candidate1 == nums[j]) {
                count1++;

            } else if (candidate2 == nums[j]) {
                count2++;
            } else {
                count1--;
                count2--;
            }

        }

        int freq1 = 0, freq2 = 0;
        for (int num : nums) {
            if (num == candidate1)
                freq1++;
            if (num == candidate2)
                freq2++;
        }
        int major = n/3;
        if (freq1 > major)
            majority.add(candidate1);
        if ( candidate1 !=candidate2 &&  freq2 >major)
            majority.add(candidate2);
        return majority;
    }
}
}
