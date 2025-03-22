public class FindThePivotInteger2485 {
//    https://leetcode.com/problems/find-the-pivot-integer/description/?envType=problem-list-v2&envId=prefix-sum

    class Solution {
        public int pivotInteger(int n) {
            int sum =(int) (n*(n+1))/2;

            int currSum = 0;
            for(int i=1;i<=n;i++){
                currSum += i;
                if(currSum == (sum - currSum +i))return i;
            }
            return -1;
        }
    }
}
