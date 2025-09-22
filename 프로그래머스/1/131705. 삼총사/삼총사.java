class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int first = 0;
        int second = first + 1;
        int third = first + 2;

        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i; j < number.length - 2; j++) {
                for (int k = j; k < number.length - 2; k++) {
                    if(number[first + i] + number[second + j] + number[third + k]==0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
} // 전부 훑은다는 생각으로 별찍기로 네모 만드는게 생각났음