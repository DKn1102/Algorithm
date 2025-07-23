import java.util.Arrays;

/**
 *
 * 문제 설명
 * 이차원 정수 배열 arr이 매개변수로 주어집니다.
 * arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고,
 * 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록
 * 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ arr의 길이 ≤ 100
 * 1 ≤ arr의 원소의 길이 ≤ 100
 * arr의 모든 원소의 길이는 같습니다.
 * 1 ≤ arr의 원소의 원소 ≤ 1,000
 * -------------------------
 *
 * System.arraycopy 를 사용하면 좀 더 쉬울 것
 *
 * */

public class MakeSquareArray {

    public int[][] solution(int[][] arr) {
        int[][] answer = {};

        if(arr.length == arr[0].length) {   // 행의 수와 열의 수가 같을 때
            return arr;
        }else if(arr.length > arr[0].length) {  // 행의 수가 열의 수보다 많을 때
            answer = new int[arr.length][arr.length];

            for (int i = 0; i < arr.length; i++) {
                answer[i] = Arrays.copyOf(arr[i], arr.length);
            }
        }else{  //열의 수가 행의 수보다 많을 때
            answer = new int[arr[0].length][arr[0].length];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MakeSquareArray c = new MakeSquareArray();

//        int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
//        int[][] arr = {{57, 192, 534, 2}, {9, 345, 192, 999}};
        int[][] arr = {{1, 2}, {3, 4}};


        System.out.println("최종 정답 : " + Arrays.deepToString(c.solution(arr)));
    }
}
