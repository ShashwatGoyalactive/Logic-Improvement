import java.util.*;
public class MinimumPlatformsForRailwaysGFG {

    class Solution {
        // Function to find the minimum number of platforms required at the
        // railway station such that no train waits.
//        https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1

        static int findPlatform(int[] arr, int[] dep) {
            // add your code here
            int n = arr.length;

            Arrays.sort(arr);
            Arrays.sort(dep);
            int max =1;
            int count =1;
            int i=1 , j=0;

            while(i<n&& j<n){
                if(arr[i] <= dep[j]){
                    count++;
                    i++;
                }else {
                    count--;
                    j++;
                }
                max= Math.max(max , count);
            }
            return max;
        }
    }

}
