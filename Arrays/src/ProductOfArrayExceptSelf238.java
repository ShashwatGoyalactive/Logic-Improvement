import java.util.*;
public class ProductOfArrayExceptSelf238 {
//    https://leetcode.com/problems/product-of-array-except-self/submissions/1570997241/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int product =1;
        for(int i=0;i<n;i++){
            prefix[i] = product *nums[i];
            product *= nums[i];
        }

        product =1;
        for(int i=n-1;i>=0;i--){
            suffix[i] = product*nums[i];
            product = product*nums[i];
        }

        ans[0] =  suffix[1];
        ans[n-1] = prefix[n-2];
        for(int i=1;i<=n-2;i++){
            ans[i] = prefix[i-1] * suffix[i+1];
        }
        return ans;
    }
}
}
