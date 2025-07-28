/**
 *
 * 문제 설명
 * 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
 * 정수 n이 매개변수로 주어질 때,
 * n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ n ≤ 1,000,000
 * -------------------------
 *
 *
 * */

public class SquareNumberChecker {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n; i++) {
            answer = i*i==n ? 1 : 2;
            if(answer == 1) break;
        }

        return answer;
    }

    public static void main(String[] args) {
        SquareNumberChecker s = new SquareNumberChecker();

//        int n = 144;    // result : 1
        int n = 976;  // result : 2

        System.out.println("최종 정답 : " + s.solution(n));
    }
}
