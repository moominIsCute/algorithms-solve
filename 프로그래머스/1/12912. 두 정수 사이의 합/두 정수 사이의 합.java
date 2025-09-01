class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long aa = (long)a;
        long bb = (long)b;
        long sum = 0;
        if(aa<bb){
        for(long i = aa; i<=bb;i++) {
            answer+=i;
        }
        }else if (bb<aa) {
            for(long i = bb; i<=aa;i++) {
            answer+=i;
        }
        } else{
            answer = aa;
        }
        return answer;
    }
}