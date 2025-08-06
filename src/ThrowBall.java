/**
 * 문제 설명
 * 머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
 * 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
 * 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때,
 * k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.
 * -------------------------
 * 제한사항
 * 2 < numbers의 길이 < 100
 * 0 < k < 1,000
 * numbers의 첫 번째와 마지막 번호는 실제로 바로 옆에 있습니다.
 * numbers는 1부터 시작하며 번호는 순서대로 올라갑니다.
 * -------------------------
 */

public class ThrowBall {

    public int solution(int[] numbers, int k) {
        int answer = 0;
        int jump   = 0;

        for (int i = 0; i <= k; i++) {
            if(i == k) break;   // i가 k 와 같으면 순번 횟수를 다 채웠으므로 루프 종료

            if(jump > numbers.length - 1) { // jump 값이 numbers 길이보다 길면 다시 0으로 초기화
                jump = jump - numbers.length ;
            }

            if(i == k-1) answer = numbers[jump];   // i가 k-1과 같으면 마지막 순번이므로 해당 순번의 numbers 값을 입력한다.

            jump += 2;  // 항상 두번째한테 공을 던짐

        }

        return answer;
    }

    public static void main(String[] args) {
        ThrowBall test = new ThrowBall();

//        int[] numbers = {1, 2, 3, 4};
//        int k = 2;  // result : 3
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int k = 5;  // result : 3
//        int[] numbers = {1, 2, 3};
//        int k = 3;  // result : 2

        System.out.println("최종 정답 : " + test.solution(numbers, k));
    }
}
