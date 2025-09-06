class Solution {
    public int[] solution(int[] arr) {

        int[] answer = {-1};
        if (arr.length > 1) {
            answer = new int[arr.length - 1];
            int min=arr[0];
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                
                if (arr[i] < min) {
                    min = arr[i];
                    
                }
            }
            for (int i = 0; i < answer.length; i++) {
                if (arr[i] == min) {
                    count++;
                } 
                    answer[i] = arr[count];
                    count++;
                
            }
        }
        return answer;
    }
}