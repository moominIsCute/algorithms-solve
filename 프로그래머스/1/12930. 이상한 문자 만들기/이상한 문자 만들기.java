class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        int wordIndex = 0;  // 각 단어 내에서의 문자 인덱스
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                result.append(c);  // 공백은 그대로 유지
                wordIndex = 0;     // 새 단어 시작을 위해 인덱스 리셋
            } else {
                if (wordIndex % 2 == 0) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                wordIndex++;
            }
        }
        
        return result.toString();
    }
}