import java.math.BigInteger;

/**
 * 문제 설명
 * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다.
 * 구슬은 모두 다르게 생겼습니다.
 * 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
 * balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ balls ≤ 30
 * 1 ≤ share ≤ 30
 * 구슬을 고르는 순서는 고려하지 않습니다.
 * share ≤ balls
 * -------------------------
 */

public class DivideMarblesWays {

    public int solution(int balls, int share) {
        int answer = 0;

        BigInteger n = factorial(BigInteger.valueOf(balls));
        BigInteger m = factorial(BigInteger.valueOf(share));
        BigInteger nm = factorial(BigInteger.valueOf(balls - share));

        answer = (n.divide(m.multiply(nm)).intValue());

        return answer;
    }

    private BigInteger factorial(BigInteger n){
        if(n.intValue() == 0) return BigInteger.valueOf(1);
        return n.multiply(factorial((n.subtract(BigInteger.valueOf(1)))));
    }

    public static void main(String[] args) {
        DivideMarblesWays test = new DivideMarblesWays();

//        int balls = 3;
//        int share = 2; // result : 3
//        int balls = 5;
//        int share = 3; // result : 10
        int balls = 30;
        int share = 15; // result : 155117520

        System.out.println("최종 정답 : " + test.solution(balls, share));
    }
}
