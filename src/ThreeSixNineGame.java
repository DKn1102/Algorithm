/**
 * 문제 설명
 * 머쓱이는 친구들과 369게임을 하고 있습니다.
 * 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
 * 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때,
 * 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ order ≤ 1,000,000
 * -------------------------
 */

public class ThreeSixNineGame {

    public int solution(int order) {
        int answer = 0;

        while(order > 0){
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) answer++;

            order /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        ThreeSixNineGame test = new ThreeSixNineGame();

//        int order = 3;  // result : 1
        int order = 29423;  // result : 2

        System.out.println("최종 정답 : " + test.solution(order));
    }
}
