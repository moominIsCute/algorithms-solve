import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String a ="";
        String answerString = String.valueOf(n);
        char[] chars = answerString.toCharArray();
        Arrays.sort(chars);
        char[] chars1 = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            chars1[i] = chars[chars.length-i-1];
            String s = String.valueOf(chars1[i]);
            a=a+s;
        }
        answer = Long.parseLong(a);


        return answer;
    }
}