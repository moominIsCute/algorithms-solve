import java.util.*;

public class Solution {
     public int solution(int n) {
        int answer = 0;
        String a = String.valueOf(n);
        char[] aa = a.toCharArray();
        for (int i = 0; i < aa.length; i++) {
            answer += Integer.parseInt(String.valueOf(aa[i]));
        }
        return answer;
    }
}