class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double aa = 0;
        for(int i =0; i < arr.length; i++){
            aa=(double)arr[i];
            answer = answer + aa;
            
        }
        return answer/arr.length;
    }
}