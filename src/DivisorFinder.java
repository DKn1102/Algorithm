import java.util.Arrays;

/**
 * 문제 설명
 * 정수 n이 매개변수로 주어질 때,
 * n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 * -------------------------
 * 제한사항
 * 1 ≤ n ≤ 10,000
 * -------------------------
 */

public class DivisorFinder {

    public int[] solution(int n) {
        int[] answer = {};
        int j = 0;
        int size = 0;

        for (int i = 1; i <= n; i++) {
            if (n%i == 0) size++;
        }

        answer = new int[size];

        for (int i = 1; i <= n; i++) {
            if (n%i == 0) answer[j++] = i;
        }

        return answer;
    }

    public static void main(String[] args) {
        DivisorFinder test = new DivisorFinder();

//        int n = 24; // result : [1, 2, 3, 4, 6, 8, 12, 24]
        int n = 29; // result : [1, 29]

        System.out.println("최종 정답 : " + Arrays.toString(test.solution(n)));
    }
}
