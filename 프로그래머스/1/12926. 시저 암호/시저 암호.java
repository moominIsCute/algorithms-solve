class Solution {
    public String solution(String s, int n) {
        String answer = "";

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (65 <= arr[i] && arr[i] <= 90) {
                arr[i] = (char) (arr[i] + n);
                if(arr[i] > 90) {
                    arr[i] = (char) (arr[i] - 26);
                }
            } else if (97 <= arr[i] && arr[i] <= 122) {
                arr[i] = (char) (arr[i] + n);
                if(arr[i] > 122) {
                    arr[i] = (char) (arr[i] - 26);
                }
            }
            answer = answer + String.valueOf(arr[i]);
        }
        return answer;
    }
}