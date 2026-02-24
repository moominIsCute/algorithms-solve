class Solution {
    public int solution(String my_string, String target) {
        // my_string이 target을 포함하고 있다면 1, 아니면 0을 반환
        return my_string.contains(target) ? 1 : 0;
    }
}