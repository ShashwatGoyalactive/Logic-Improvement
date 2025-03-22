public class RangeSumQueryImmutable303{
//    https://leetcode.com/problems/range-sum-query-immutable/description/?envType=problem-list-v2&envId=prefix-sum

    class NumArray {
        private int[] arr;
        public NumArray(int[] nums) {
            arr = nums.clone();
            for(int i=1;i<arr.length;i++){
                arr[i] += arr[i-1];
            }
        }

        public int sumRange(int left, int right) {
            if(left > 0) return arr[right] - arr[left -1];
            return arr[right];
        }
    }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */}
