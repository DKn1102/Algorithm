import java.util.Arrays;

/**
 *
 * 문제 설명
 * 정수 n이 매개변수로 주어질 때,
 * 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.
 *
 * arr[i][j] (0 ≤ i, j < n)의 값은
 * i = j라면 1, 아니라면 0입니다.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ n ≤ 100
 * -------------------------
 *
 * */

public class DiagonalOneMatrix {

    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = i == j ? 1 : 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        DiagonalOneMatrix d = new DiagonalOneMatrix();

        int n = 3;
//        int n = 6;
//        int n = 1;

        System.out.println("최종 정답 : " + Arrays.toString(d.solution(n)));
    }
}
