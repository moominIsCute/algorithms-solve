class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = 0;
        long prices = price;

        for (int i = 1; i <= count; i++) {
            totalPrice = totalPrice + (long)(prices*i);
        }
        answer = totalPrice- money;
        if (answer < 0) {
            answer = 0;
        }
        return answer;
    }
}