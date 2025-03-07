import java.util.*;
public class InsertInterval57 {
//    https://leetcode.com/problems/insert-interval/description/
    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {

            int n = intervals.length;
            int i=0;

            boolean modified = false;
            for( i=0;i<n;i++){
                int start = intervals[i][0];
                int end = intervals[i][1];

                if(start > newInterval[1]){
                    break;
                }
                else {

                    if(end >= newInterval[0]){
                        modified = true;
                        intervals[i][1] = Math.max(end , newInterval[1]);
                        intervals[i][0] = Math.min(start , newInterval[0]);
                        break;
                    }
                }

            }

            if(modified) {
                return merge(intervals);
            }
            int[][] res = new int[n+1][2];
            res[i][0] = newInterval[0];
            res[i][1] = newInterval[1];
            for(int j=0;j<n+1;j++){
                if(j<i){
                    res[j][0] = intervals[j][0];
                    res[j][1] = intervals[j][1];
                }else if (j>i){
                    res[j][0] = intervals[i][0];
                    res[j][1] = intervals[i][1];
                    i++;
                }

            }


            return merge(res);

        }
        public int[][] merge(int[][] arr){
            ArrayList<int[]> ans = new ArrayList<>();
            ans.add(arr[0]);
            int ind =0;
            int n = arr.length;
            for(int i =1;i<n;i++){
                if(ans.get(ind)[1] >= arr[i][0]){
                    int[] pair = ans.get(ind);
                    pair[1] = Math.max(pair[1] , arr[i][1]);
                    ans.set(ind, pair);
                }else {
                    ind++;
                    ans.add(ind , arr[i]);
                }
            }
            int n1 = ans.size();
            int[][] res = new int[n1][2];

            for(int i=0;i<n1;i++){
                res[i][0] = ans.get(i)[0];
                res[i][1] = ans.get(i)[1];
            }

            return res;
        }
    }
}
