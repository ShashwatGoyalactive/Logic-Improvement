import java.util.*;
public class NextPermutation31 {

//    https://leetcode.com/problems/next-permutation/submissions/1568686717/
class Solution {
    public void nextPermutation(int[] nums) {
        int n= nums.length;
        if
        (n==1)return;
        int ind1=-1;
        int ind2=-1;

        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                ind1 = i;
                break;
            }
        }

        if(ind1 == -1){
            reverse(nums,0);
            return;
        }

        for(int i=n-1;i>=0;i--){
            if(nums[i] > nums[ind1]){
                ind2 = i;
                break;
            }
        }

        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;

        reverse(nums , ind1 +1);
    }

    public void reverse(int[] nums , int start){
        int i=start;
        int j =nums.length-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
}
