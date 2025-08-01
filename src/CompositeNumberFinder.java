/**
 * 문제 설명
 * 약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
 * 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
 * -------------------------
 * 제한사항
 * 1 ≤ n ≤ 100
 * -------------------------
 */

public class CompositeNumberFinder {

    public int solution(int n) {
        int answer = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++){
                if(i%j == 0) count++;
            }

            if(count >= 3) answer++;

            count = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        CompositeNumberFinder test = new CompositeNumberFinder();

//        int n = 10; // result : 5
        int n = 15; // result : 8

        System.out.println("최종 정답 : " + test.solution(n));
    }
}
