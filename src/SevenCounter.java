/**
 * 문제 설명
 * 머쓱이는 행운의 숫자 7을 가장 좋아합니다.
 * 정수 배열 array가 매개변수로 주어질 때,
 * 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ array의 길이 ≤ 100
 * 0 ≤ array의 원소 ≤ 100,000>
 * -------------------------
 */

public class SevenCounter {

    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) answer += 1;
            else if (array[i] > 7) {
                while (array[i] > 0) {
                    if(array[i] % 10 == 7) answer ++;
                    array[i] /= 10;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        SevenCounter test = new SevenCounter();

//        int[] array = {7, 77, 17};  // result : 4
        int[] array = {10, 29};  // result : 0

        System.out.println("최종 정답 : " + test.solution(array));
    }
}
