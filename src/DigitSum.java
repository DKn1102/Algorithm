/**
 *
 * 문제 설명
 * 정수 n이 매개변수로 주어질 때
 * n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
 *
 * -------------------------
 * 제한사항
 * 0 ≤ n ≤ 1,000,000
 * -------------------------
 *
 *
 * */

public class DigitSum {

    public int solution(int n) {
        int answer = 0;

        while(n > 0){
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        DigitSum d = new DigitSum();

//        int n = 1234; // 10
        int n = 930211; // 16

        System.out.println("최종 정답 : " + d.solution(n));
    }
}
