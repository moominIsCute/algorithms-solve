class Solution {
    public boolean solution(int x) {
        boolean answer = false;

        String xStr = String.valueOf(x);
        char[] arr = xStr.toCharArray();
        int[] intArr = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.valueOf(arr[i] - '0');
            sum = sum + intArr[i];
        }
        
        if (x%sum == 0) {
            answer = true;
        }

        return answer;
    }
}