import java.util.Arrays;

public class AddRemoveEmptyArr {

    static class Solution {
        public int[] solution(int[] arr, boolean[] flag) {
            int[] answer = new int[0];
            int[] copyArr = {};


            for(int i=0; i < flag.length; i++){
                if(i == 0){
                    answer = new int[arr[i] * 2];
                }

                if(flag[i]){
                    for(int j=0; j < arr[i] * 2; j++){
                        if(i==0){
                            answer[j] = arr[i];
                        }else{
                            answer = Add(answer, arr[i]);
                        }

                    }

                }else{
                    copyArr = new int[answer.length - arr[i]];

                    System.arraycopy(answer, 0, copyArr, 0, answer.length - arr[i]);

                    answer = copyArr;
                }
            }

            return answer;
        }

        private int[] Add(int[] originArray, int val) {
            int[] newArray = new int[originArray.length + 1];

            for(int i=0; i< originArray.length; i++){
                newArray[i] = originArray[i];
            }

            newArray[originArray.length] = val;

            return newArray;
        }

    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};

        System.out.println("정답 : " + Arrays.toString(s.solution(arr, flag)));
    }
}