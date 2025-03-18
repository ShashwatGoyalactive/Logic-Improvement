import java.util.*;
public class GroupAnagram49 {
    public static void main(String[] args)
    {
//        https://leetcode.com/problems/group-anagrams/description/
        class Solution {
            public List<List<String>> groupAnagrams(String[] strs) {
                HashMap<String , ArrayList<String>> map = new HashMap<>();

                for(String str : strs ){
                    char[] arr = str.toCharArray();
                    Arrays.sort(arr);
                    // System.out.println(arr);
                    String s  = String.valueOf(arr);
                    // System.out.println(s);

                    if(map.containsKey(s)){
                        ArrayList<String> list = map.get(s);
                        list.add(str);
                        map.put(s ,list);
                    }else {
                        ArrayList<String> list = new ArrayList<>();
                        list.add(str);
                        map.put(s, list);
                    }
                }

                List<List<String>> res = new ArrayList<>();
                for(ArrayList<String> pair : map.values()){
                    res.add(pair);
                }
                return res;
            }
        }
    }
}