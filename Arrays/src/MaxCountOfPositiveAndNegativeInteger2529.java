import java.util.*;
public class MaxCountOfPositiveAndNegativeInteger2529 {
//    https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/?envType=daily-question&envId=2025-03-12
class Solution {
    public int maximumCount(int[] nums) {
        int count=0;
        int zero =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                count++;
            }
            if(nums[i]==0)zero++;
        }
        if(count>=nums.length-count -zero) return count;
        return nums.length-count-zero;
    }
}
}
