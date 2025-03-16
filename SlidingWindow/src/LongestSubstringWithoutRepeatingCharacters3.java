import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters3 {
//    https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();

        int i=0;
        int j =i;
        int size =0;
        while(j<n ){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                size = Math.max(size , set.size());
                j++;
            }else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return size;
    }
}
}
