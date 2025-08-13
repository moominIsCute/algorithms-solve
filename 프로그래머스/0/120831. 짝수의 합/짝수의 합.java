class Solution {
    public int solution(int n) {

                int total =0;
                int array[] = new int[n];
                array[0]= 1;
                for(int i = 0; i<array.length; i++ ){
                    array[i] = i+1;
                    if(i%2 == 1){
                        total = total +array[i];
                    }
                }
                return total;
            }
}