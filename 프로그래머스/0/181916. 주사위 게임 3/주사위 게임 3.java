import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : new int[]{a, b, c, d}) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(counts.keySet());
        int size = counts.size();

        if (size == 1) {
            int p = keys.get(0);
            return 1111 * p;
            
        } else if (size == 2) {
            if (counts.containsValue(3)) {
                int p = 0, q = 0;
                for (int key : keys) {
                    if (counts.get(key) == 3) p = key;
                    else q = key;
                }
                return (int) Math.pow(10 * p + q, 2);
            } else {
                int p = keys.get(0);
                int q = keys.get(1);
                return (p + q) * Math.abs(p - q);
            }
            
        } else if (size == 3) {
            int score = 1;
            for (int key : keys) {
                if (counts.get(key) != 2) {
                    score *= key;
                }
            }
            return score;
            
        } else {
            return Collections.min(keys);
        }
    }
}