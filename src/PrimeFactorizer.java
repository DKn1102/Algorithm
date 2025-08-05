import java.util.ArrayList;
import java.util.Arrays;

/**
 * 문제 설명
 * 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
 * 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
 * 따라서 12의 소인수는 2와 3입니다.
 * 자연수 n이 매개변수로 주어질 때 n의 소인수를
 * 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 * -------------------------
 * 제한사항
 * 2 ≤ n ≤ 10,000
 * -------------------------
 */

public class PrimeFactorizer {

    public int[] solution(int n) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if(isPrimeFactor(i) && n%i==0) list.add(i);
        }

        answer = new int[list.size()];

        for(int num : list){
            answer[list.indexOf(num)] = num;
        }

        return answer;
    }

    private boolean isPrimeFactor(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeFactorizer test = new PrimeFactorizer();

//        int n = 12; // result : [2, 3]
//        int n = 17; // result : [17]
        int n = 420; // result : [2, 3, 5, 7]


        System.out.println("최종 정답 : " + Arrays.toString(test.solution(n)));
    }
}
