import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            if (stkList.isEmpty()) {
                stkList.add(arr[i]);
                i++;
            } else {
                // 리스트의 마지막 원소 가져오기
                int lastElement = stkList.get(stkList.size() - 1);
                
                if (lastElement < arr[i]) {
                    stkList.add(arr[i]);
                    i++;
                } else {
                    // 마지막 원소가 arr[i]보다 크거나 같으면 제거
                    stkList.remove(stkList.size() - 1);
                }
            }
        }
        
        // List<Integer>를 int[]로 변환
        int[] stk = new int[stkList.size()];
        for (int j = 0; j < stkList.size(); j++) {
            stk[j] = stkList.get(j);
        }
        
        return stk;
    }
}