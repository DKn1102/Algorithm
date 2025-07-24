import java.util.Arrays;

/**
 *
 * 문제 설명
 * 양의 정수 n이 매개변수로 주어집니다.
 * n × n 배열에 1부터 n² 까지 정수를 인덱스 [0][0]부터
 * 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ n ≤ 30
 * -------------------------
 *
 * 피보나치수열 거꾸로 생각
 *
 * */

public class SpiralMatrixGenerator {

    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int num = 1;
        int root = 2*n-1;

        int rows = 0; // 행의 수
        int cols = 0; // 열의 수

        for (int i = 0; i < root; i++) {
            for (int j = 0; j < n; j++) {

                //짝수면 행, 홀수면 열
                if(i%2==0) { //행
                    if(rows <= cols) {  // 오른쪽
                        answer[rows][cols++] = num++; // 오른쪽
                        if (j+1 == n) { // 오른쪽 마지막 행렬인 경우
                            cols--;
                            n--;
                        }
                    }else{ // 왼쪽
                        answer[rows][cols] = num++; // 왼쪽
                        if (j+1 == n) {
                            rows--;
                            n--;
                        }else{
                            cols--;
                        }
                    }
                }else{  //열
                    if(rows <= cols){   // 아래쪽
                        answer[++rows][cols] = num++; // 아래쪽
                        if(rows == cols) { // 아래쪽 마지막 행렬인 경우
                            cols--;
                        }
                    }else { // 위쪽
                        answer[rows--][cols] = num++; // 위쪽
                        if(answer[rows][cols] != 0){
                            rows++;
                            cols++;
                        }
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        SpiralMatrixGenerator s = new SpiralMatrixGenerator();

        int n = 30;
//        int n = 5;

        System.out.println("최종 정답 : " + Arrays.deepToString(s.solution(n)));
    }
}
