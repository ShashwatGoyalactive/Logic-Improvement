import java.util.*;
public class MaximumNumberofVowelsInaSubstringofGivenLength1456 {
//    https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int i = 0;

        int currCount = 0;
        while (i < k) {
            if(set.contains(s.charAt(i))){
                currCount++;
            }
            i++;
        }
        int maxCount = currCount;
        for (i = k; i < n; i++) {

            if (set.contains(s.charAt(i - k)) ) {
                currCount--;
            }

            if (set.contains(s.charAt(i))) {
                currCount++;
            }
            if (currCount == k)
                return k;
            maxCount = Math.max(maxCount, currCount);

        }
        return maxCount;
    }

}
}
