import java.util.*;
public class NMeetingsInRoomGFG {
    class Solution {
        // Function to find the maximum number of meetings that can
        // be performed in a meeting room.
        class Pair{
            int start;
            int end;

            public Pair(int start, int end){
                this.start = start;
                this.end = end;
            }
        }
        public int maxMeetings(int start[], int end[]) {
            // add your code here

            int n = start.length;
            ArrayList<Pair> arr = new ArrayList<>();

            for(int i=0;i<n;i++){
                arr.add(new Pair(start[i] , end[i]));
            }

            Collections.sort(arr , (a , b) -> a.end - b.end);
            int count =1;
            int lastEnd = arr.get(0).end;

            for(int i=1;i<arr.size();i++){
                if(arr.get(i).start > lastEnd){
                    count++;
                    lastEnd = arr.get(i).end;
                }
            }
            return count;
        }
    }
}
