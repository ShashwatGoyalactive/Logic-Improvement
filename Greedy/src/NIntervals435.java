import java.util.*;
public class NIntervals435 {
//    https://leetcode.com/problems/non-overlapping-intervals/description/

    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            int n = intervals.length;
            return n - maxScheduleMeetings(intervals);
        }

        public int maxScheduleMeetings(int[][] intervals){

            Arrays.sort(intervals , new Comparator<int[]>(){
                public int compare(int[] a , int[] b){
                    return a[1] -b[1];
                }
            });

            int meetings = 1;
            int endTime = intervals[0][1];
            for(int i=1;i<intervals.length;i++){
                if(intervals[i][0] >= endTime){
                    endTime = intervals[i][1];
                    meetings++;
                }
            }
            return meetings;
        }
    }
}
