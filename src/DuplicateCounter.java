
/**
 *
 * 문제 설명
 * 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
 * array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ array의 길이 ≤ 100
 * 0 ≤ array의 원소 ≤ 1,000
 * 0 ≤ n ≤ 1,000
 * -------------------------
 *
 *
 * */

public class DuplicateCounter {

    public int solution(int[] array, int n) {
        int answer = 0;

        for(int i : array){
            if (n == i) answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        DuplicateCounter d = new DuplicateCounter();

//        int[] array = {1, 1, 2, 3, 4, 5};
//        int n = 1;  // result : 2
//
        int[] array = {0, 2, 3, 4};
        int n = 1;  // result : 0

        System.out.println("최종 정답 : " + d.solution(array, n));
    }
}
