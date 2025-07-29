import java.util.Arrays;

/**
 * 문제 설명
 * 정수 배열 array가 매개변수로 주어질 때,
 * 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 * -------------------------
 * 제한사항
 * 1 ≤ array의 길이 ≤ 100
 * 0 ≤ array 원소 ≤ 1,000
 * array에 중복된 숫자는 없습니다.
 * -------------------------
 */

public class MaxNumberFinder {

    public int[] solution(int[] array) {
        int[] answer = new int[2];

        int[] copy = array.clone();

        Arrays.sort(array);

        answer[0] = array[array.length - 1];

        for (int i = 0; i < array.length; i++) {
            if (answer[0] == copy[i]) answer[1] = i;
        }

        return answer;
    }

    public static void main(String[] args) {
        MaxNumberFinder test = new MaxNumberFinder();

//        int[] array = {1, 8, 3};        // result : [8, 1]
        int[] array = {9, 10, 11, 8};   // result : [11, 2]

        System.out.println("최종 정답 : " + Arrays.toString(test.solution(array)));
    }
}
