class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int i = s; i <= e; i++) {
                // k가 0인 경우 i % k 연산 시 에러가 발생할 수 있으므로 체크
                if (k == 0) {
                    if (i == 0) arr[i] += 1;
                    continue;
                }
                
                // i가 k의 배수인지 확인
                if (i % k == 0) {
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }
}