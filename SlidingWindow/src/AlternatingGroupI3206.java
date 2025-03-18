public class AlternatingGroupI3206 {
//    https://leetcode.com/problems/alternating-groups-i/description/
class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        int n = colors.length;

        for (int i = 0; i < n; i++) {
            int left = colors[(i - 1 + n) % n];
            int middle = colors[i];
            int right = colors[(i + 1) % n];

            if (left != middle && right != middle) {
                count++;
            }
        }
        return count;
    }
}
}
