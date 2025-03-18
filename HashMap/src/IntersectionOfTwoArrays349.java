import java.util.*;
public class IntersectionOfTwoArrays349 {
//    https://leetcode.com/problems/intersection-of-two-arrays/description/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        ArrayList<Integer> intersectELements = new ArrayList<>();

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for(int num : nums1){
            hs1.add(num);
        }

        for(int num : nums2){
            hs2.add(num);
        }

        for(int num: hs1){
            if(hs2.contains(num)){

                intersectELements.add(num);
            }
        }
        return intersectELements.stream().mapToInt(Integer::intValue).toArray();
    }
}
}
