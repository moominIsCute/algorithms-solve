class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int arrNum = Integer.valueOf(arr[i]);
            if (48 > arrNum || arrNum > 57) {
                answer = false;
                break;
            }
        }


        return answer;
    }
}