class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int row= 0;
        int column = 0;
        int convert = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] <= sizes[i][1]) {
                convert = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = convert;
            }

            if (row <=sizes[i][0]) {
                row = sizes[i][0];
            }
            if (column <= sizes[i][1]) {
                column = sizes[i][1];
            }
        }

        answer = row * column;


        return answer;
    }
}