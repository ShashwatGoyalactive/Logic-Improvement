import java.util.*;
public class GrumpyBookstoreOwner1052 {
//    https://leetcode.com/problems/grumpy-bookstore-owner/description/

    class Solution {
        public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
            int n = customers.length;
            int total =0;
            for(int i=0;i<n;i++){
                if(grumpy[i] == 0){
                    total += customers[i];
                }
            }

            int windowSum =0;
            for(int i=0;i<minutes;i++){
                if(grumpy[i] ==1){
                    windowSum += customers[i];
                }
            }

            int max = windowSum;
            int left =0;
            int right = minutes;

            while(right <n){
                if(grumpy[right] ==1){
                    windowSum += customers[right];
                }
                if (grumpy[left] == 1) {
                    windowSum -= customers[left];
                }
                max = Math.max(max , windowSum);
                left++;
                right++;
            }
            return total + max;
        }
    }

}
