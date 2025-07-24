import java.util.Arrays;

/**
 *
 * 문제 설명
 * 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을
 * return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 0 ≤ numbers의 원소 ≤ 10,000
 * 2 ≤ numbers의 길이 ≤ 100
 * -------------------------
 *
 * Arrays.sort(numbers); 를 사용하면 매우매우 쉬움
 *
 * */
public class MaxProduct1 {

    public int solution(int[] numbers) {
        int answer = 0;
        int temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        answer = numbers[0] * numbers[1];

        System.out.println("array : " + Arrays.toString(numbers));

        return answer;
    }

    public static void main(String[] args) {
        MaxProduct1 m = new MaxProduct1();

        int[] numbers = {1, 2, 3, 4, 5};
//        int[] numbers = {0, 31, 24, 10, 1, 9};

        System.out.println("최종 정답 : " + m.solution(numbers));
    }
}
