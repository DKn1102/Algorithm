import java.util.ArrayList;
import java.util.Arrays;

public class CreateArray6 {
    /**
     *  if stk이 빈 배열이면 arr[i]를 stk에 추가 후 i++
     *  if stk에 원소가 있고, stk[stk.length] == arr[i] 이면 stk[stk.length]를 stk에서 제거 후 i++
     *  if stk에 원소가 있고, stk[stk.length] != arr[i] 이면 stk[stk.length + 1]에 arr[i]를 추가 후 i++
     *
     *  위 작업 후 stk를 return 빈배열인 경우 -1 return
     */
    static class Solution {
        public int[] solution(int[] arr) {
            int[] answer = {};
            ArrayList<Integer> stk = new ArrayList();
            int j = 0;

            for (int i = 0; i < arr.length; i++) {
                if(stk.isEmpty()){
                    stk.add(arr[i]);

                } else if (!stk.isEmpty() && stk.get(stk.size() - 1) == arr[i]) {
                    stk.remove(stk.size() - 1);

                } else if (!stk.isEmpty() && stk.get(stk.size() - 1) != arr[i]) {
                    stk.add(stk.size(), arr[i]);

                }
            }


            answer = new int[stk.size() == 0 ? 0 : stk.size()];


            for(int result : stk){
                answer[j++] = result;
            }

            if(answer.length == 0) answer = new int[]{-1};

            return answer;
        }
    }

    public static void main(String[] args) {
        CreateArray6.Solution s = new CreateArray6.Solution();

//        int[] arr = {0, 1, 1, 1, 0};
        int[] arr = {0, 1, 1, 0};

        System.out.println("정답 : " + Arrays.toString(s.solution(arr)));
    }
}
