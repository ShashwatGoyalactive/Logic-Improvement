import java.util.*;
public class ArrayLeaders {
//    https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=leaders-in-an-array
    class Solution {
        static ArrayList<Integer> leaders(int arr[]) {
            // code here
            ArrayList<Integer> ans = new ArrayList<>();
            int n = arr.length;

            if(n==1) {
                ans.add(arr[0]);
                return ans;
            }

            ans.add(arr[n-1]);

            int largest = arr[n-1];

            for(int i=n-2;i>=0;i--){
                if(arr[i] >= largest){
                    ans.add(0,arr[i]);
                    largest = arr[i];
                }
            }
            return ans;
        }
    }


}
