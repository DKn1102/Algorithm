/**
 * 문제 설명
 * 정수 num과 k가 매개변수로 주어질 때,
 * num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
 * 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
 * -------------------------
 * 제한사항
 * 0 < num < 1,000,000
 * 0 ≤ k < 10
 * num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.
 * -------------------------
 */

public class DigitFinder {

    public int solution(int num, int k) {
        int answer = 0;

//        answer = String.valueOf(num).contains(String.valueOf(k)) ? String.valueOf(num).indexOf(String.valueOf(k)) + 1 : -1;
        answer = String.valueOf(num).contains(String.valueOf(k)) ? (" "+num).indexOf(String.valueOf(k)) : -1;

        return answer;
    }

    public static void main(String[] args) {
        DigitFinder test = new DigitFinder();

//        int num = 29183;
//        int k = 1;  // result : 3
        int num = 232443;
        int k = 4;  // result : 4
//        int num = 123456;
//        int k = 7;  // result : -1

        System.out.println("최종 정답 : " + test.solution(num, k));
    }
}
