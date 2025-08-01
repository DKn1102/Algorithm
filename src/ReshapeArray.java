import java.util.Arrays;

/**
 * 문제 설명
 * 정수 배열 num_list와 정수 n이 매개변수로 주어집니다.
 * num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
 *
 * num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로
 * num_list를 2 * 4 배열로 다음과 같이 변경합니다.
 * 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
 *
 * num_list     [1, 2, 3, 4, 5, 6, 7, 8]
 * n	        2
 * result       [[1, 2], [3, 4], [5, 6], [7, 8]]
 *
 * -------------------------
 * 제한사항
 * num_list의 길이는 n의 배 수개입니다.
 * 0 ≤ num_list의 길이 ≤ 150
 * 2 ≤ n < num_list의 길이
 * -------------------------
 */

public class ReshapeArray {

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int k = 0;
        int l = 0;

        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {

                answer[k][j] = num_list[l];
                l++;
            }
            k++;
        }

        // 이렇게 for loop 한번만으로도 가능...
//        for(int i=0; i < num_list.length; i++){
//            answer[i/n][i%n]=num_list[i];
//        }

        return answer;
    }

    public static void main(String[] args) {
        ReshapeArray test = new ReshapeArray();

//        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
//        int n = 2;  // result : [[1, 2], [3, 4], [5, 6], [7, 8]]
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n = 3;  // result : [[100, 95, 2], [4, 5, 6], [18, 33, 948]]


        System.out.println("최종 정답 : " + Arrays.deepToString(test.solution(num_list, n)));
    }
}
