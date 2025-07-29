import java.util.Arrays;

/**
 * 문제 설명
 * 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
 * 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 3 ≤ numbers의 길이 ≤ 20
 * direction은 "left" 와 "right" 둘 중 하나입니다.
 * -------------------------
 */

public class ArrayRotator {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int right = 0;
        int left = 0;
        int[] clone = {};


        if("right".equals(direction)){
            right = numbers[numbers.length - 1];
            clone = Arrays.copyOfRange(numbers, 0, numbers.length - 1);

            for(int i=0; i < clone.length; i++){
                answer[i+1] = clone[i];
            }

            answer[0] = right;

        }else if("left".equals(direction)) {
            left = numbers[0];
            clone = Arrays.copyOfRange(numbers, 1, numbers.length);

            for(int i=0; i < clone.length; i++){
                answer[i] = clone[i];
            }

            answer[answer.length - 1] = left;
        }

        return answer;
    }

    public static void main(String[] args) {
        ArrayRotator test = new ArrayRotator();

        int[] numbers = {1, 2, 3};
        String direction = "right"; // [3, 1, 2]
//        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
//        String direction = "left"; // [455, 6, 4, -1, 45, 6, 4]

        System.out.println("최종 정답 : " + Arrays.toString(test.solution(numbers, direction)));
    }
}
