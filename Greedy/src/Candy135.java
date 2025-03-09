import java.util.*;
public class Candy135 {
//    https://leetcode.com/problems/candy/description/
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if(n==1)return 1;
        int[] candy = new int[n];

        Arrays.fill(candy , 1);

        for(int i=1;i<n;i++){
            if(ratings[i] > ratings[i-1]){
                candy[i] = candy[i-1]+1;
            }
        }

        for(int i=n-2;i>=0;i--){
            if(ratings[i] > ratings[i+1]){
                candy[i] = Math.max(candy[i] , candy[i+1]+1);
            }
        }
        int sum =0;
        for(int num : candy)sum +=num;
        for(int i=0;i<n;i++){
            System.out.print(candy[i] + " ");
        }
       
        return sum;

    }
}
}
