class Solution {
    public int[] solution(long n) {
   
        String a = String.valueOf(n);
        char[] chars = a.toCharArray();
        int[] answer =  new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            answer[chars.length-i-1] = Integer.valueOf(chars[i]+"");
        }

        return answer;
    }
}