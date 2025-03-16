import java.util.*;
public class FruitsIntoBaskets904 {
//    https://leetcode.com/problems/fruit-into-baskets/description/


    public class Solution {
        public int totalFruit(int[] fruits) {
            int n = fruits.length;
            if (n == 0) return 0;

            HashMap<Integer, Integer> fruitCount = new HashMap<>();
            int left = 0, maxFruits = 0;

            for (int right = 0; right < n; right++) {
                fruitCount.put(fruits[right], fruitCount.getOrDefault(fruits[right], 0) + 1);


                while (fruitCount.size() > 2) {
                    fruitCount.put(fruits[left], fruitCount.get(fruits[left]) - 1);
                    if (fruitCount.get(fruits[left]) == 0) {
                        fruitCount.remove(fruits[left]);
                    }
                    left++;
                }

                maxFruits = Math.max(maxFruits, right - left + 1);
            }

            return maxFruits;
        }
    }

}
