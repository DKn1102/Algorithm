/**
 * 문제 설명
 * 정수 배열 array와 정수 n이 매개변수로 주어질 때,
 * array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ array의 길이 ≤ 100
 * 1 ≤ array의 원소 ≤ 100
 * 1 ≤ n ≤ 100
 * 가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
 * -------------------------
 */

public class NearestNumberFinder {

    public int solution(int[] array, int n) {
        int answer = n;

        for (int i = 0; i < array.length; i++) {
            if (i==0) answer = array[i];    // n 값이 배열에 있는 수보다 작은 경우 대응

            if(Math.abs(array[i] - n) == Math.abs(answer - n)) {    // array[i] - n 의 절대값과 기존 answer - n 의 절대값을 비교하여 같은 경우 더 작은 값을 answer로 함
                answer = array[i] > answer ? answer : array[i];
            }else {
                answer = Math.abs(array[i] - n) < Math.abs(answer - n) ? array[i] : answer; //  array[i] - n 의 절대값이 더 작은 경우 해당 값을 answer로 수정
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        NearestNumberFinder test = new NearestNumberFinder();

//        int[] array = {3, 10, 28};
//        int n = 20; // result : 28
//        int[] array = {10, 11, 12};
//        int n = 13; // result : 12
//        int[] array = {10, 11, 14, 12};
//        int n = 13; // result : 12
        int[] array = {2, 3, 4};
        int n = 1; // result : 2

        System.out.println("최종 정답 : " + test.solution(array, n));
    }
}
