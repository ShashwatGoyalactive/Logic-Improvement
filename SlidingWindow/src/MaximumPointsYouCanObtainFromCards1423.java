import java.util.*;
public class MaximumPointsYouCanObtainFromCards1423 {
//    https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        if(k>n)return -1;
        if(k==n)return sum(cardPoints , 0 , n-1);

        int maxSum =0 , i=0;
        for( i=0;i<k;i++){
            maxSum += cardPoints[i];
        }
        i=k-1;
        int count =k;
        int j = n-1;
        int sum = maxSum;
        while(count>0){
            sum = sum - cardPoints[i--] + cardPoints[j--];
            maxSum = Math.max(maxSum , sum);
            count--;
        }
        return maxSum;

    }


    public int sum(int[] arr , int start , int end){
        int sum =0;
        for(int num : arr)sum+=num;
        return sum;
    }
}
}
