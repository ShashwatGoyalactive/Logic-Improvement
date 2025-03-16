import java.util.*;
public class NumberOfSubstringsContainingAllThreeCharacters1358 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
//    https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();

        int[] freq = new int[3];
        int count =0;
        int left =0;
        for(int right =0;right<n;right++){
            freq[s.charAt(right)-'a']++;
            while(freq[0] >=1 && freq[1]>=1 && freq[2] >=1){
                count += s.length()-right;
                freq[s.charAt(left) -'a']--;
                left++;
            }
        }
        return count;
    }


}
}