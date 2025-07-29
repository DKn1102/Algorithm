import java.util.Arrays;

/**
 * 문제 설명
 * 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 * -------------------------
 * 제한사항
 * -10,000 ≤ numbers의 원소 ≤ 10,000
 * 2 ≤ numbers 의 길이 ≤ 100
 * -------------------------
 */

public class MaxProduct2 {

    public int solution(int[] numbers) {
        int answer = -100000001;
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i==j) continue;
                System.out.println(numbers[i] + " * " + numbers[j] + " = " + numbers[i] * numbers[j]);
                max = numbers[i] * numbers[j];

                if(answer < max) answer = max;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MaxProduct2 test = new MaxProduct2();

//        int[] numbers = {1, 2, -3, 4, -5};          // result : 15
//        int[] numbers = {0, -31, 24, 10, 1, 9};     // result : 240
//        int[] numbers = {10, 20, 30, 5, 5, 20, 5};  // result : 600
        int[] numbers = {-1, 2};  // result : -2

        System.out.println("최종 정답 : " + test.solution(numbers));
    }
}
