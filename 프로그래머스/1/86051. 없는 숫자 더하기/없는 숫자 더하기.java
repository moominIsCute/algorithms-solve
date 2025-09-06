class Solution {
    public int solution(int[] numbers) {

        int answer = 0;
        for (int i = 0; i < 10; i++) {
            answer = answer + i;
        }

        int sumNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumNumbers += numbers[i];
        }
        answer = answer - sumNumbers;

        return answer;
    }
}