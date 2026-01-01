import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (isOnlyZeroFive(i)) {
                list.add(i);
            }
        }
        
        // 리스트가 비어있다면 -1을 담은 배열 반환
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        
        // List<Integer>를 int[] 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    // 숫자가 0과 5로만 이루어졌는지 확인하는 보조 메서드
    private boolean isOnlyZeroFive(int num) {
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}