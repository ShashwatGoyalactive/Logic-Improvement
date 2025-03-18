import java.util.*;
public class IntersectionOfTwoArraysII350 {
//    https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            ArrayList<Integer> ans = new ArrayList<>();
            int i=0 , j=0 , n1=nums1.length , n2 = nums2.length;
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            while(i<n1 && j<n2){
                if(nums1[i] == nums2[j]){
                    ans.add(nums1[i]);
                    i++;
                    j++;
                }else if(nums1[i] > nums2[j]){
                    j++;
                }
                else{
                    i++;
                }
            }


            int[] arr = new int[ans.size()];
            for(int k=0;k<ans.size();k++){
                arr[k] = ans.get(k);
            }
            return arr;
        }
    }
}
