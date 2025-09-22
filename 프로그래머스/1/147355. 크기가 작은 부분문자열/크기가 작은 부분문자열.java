import java.math.BigInteger;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        BigInteger pNumber = new BigInteger(p);
        String[] words = t.split("");

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String sum = "";
            for (int j = 0; j < p.length(); j++) {
                sum = sum + words[i + j];
            }
            BigInteger tNumber = new BigInteger(sum);
            if (tNumber.compareTo(pNumber) <=0) {
                answer++;
            }
        }

        return answer;
    }
}