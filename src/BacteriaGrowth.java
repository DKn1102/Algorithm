/**
 *
 * 문제 설명
 * 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
 * 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때
 * t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ n ≤ 10
 * 1 ≤ t ≤ 15
 * -------------------------
 *
 *
 * */

public class BacteriaGrowth {
    public int solution(int n, int t) {
        int answer = n;

        for (int i = 0; i < t; i++) {
            answer *= 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        BacteriaGrowth b = new BacteriaGrowth();

        int n = 2;  // 2048
        int t = 10;
//        int n = 7;
//        int t = 15; //229376

        System.out.println("최종 정답 : " + b.solution(n, t));
    }
}
