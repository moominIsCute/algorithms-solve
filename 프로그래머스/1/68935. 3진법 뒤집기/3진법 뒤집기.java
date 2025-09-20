class Solution {
    public int solution(int n) {
        int answer = 0;
        double a = 0;
        int org = n;
        int count = 0;
        double convert = 1;



        while (org > 0) {
            org = org / 3;
            count++;
        }
        int [] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = n%3;
            n = n/3;
            convert = arr[i]*Math.pow(3,count-i-1);
            a = a + convert;
        }
        answer = (int)a;

        return answer;
    }
}