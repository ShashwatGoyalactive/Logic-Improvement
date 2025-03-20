public class ContainerWithMostWater11 {
//    https://leetcode.com/problems/container-with-most-water/description/
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;


        int left =0;
        int right = n-1;

        int maxArea = 0;

        while(left <right){
            int minHeight = Math.min(height[left] , height[right]);
            int area = Math.min(height[left] , height[right])*(right - left);
            maxArea = Math.max(area , maxArea);
            if( height[left] == minHeight )left++;
            else right--;

        }
        return maxArea;

    }
}
}
