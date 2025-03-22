import  java.util.*;
public class ContinuousubArraySum523 {
//    https://leetcode.com/problems/continuous-subarray-sum/description/?envType=problem-list-v2&envId=prefix-sum
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> mod = new HashMap<>();
        mod.put(0,-1);
        int prefix = 0;
        for(int i=0;i<n;i++){
            prefix = (prefix + nums[i])%k;

            if(mod.containsKey(prefix)){
                if(i-mod.get(prefix) > 1){
                    return true;
                }
            }else{
                mod.put(prefix ,i);
            }
        }

        return false;
    }
}
}
