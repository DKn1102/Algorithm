/**
 * 문제 설명
 * 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
 * 정수 i, j, k가 매개변수로 주어질 때,
 * i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
 * <p>
 * -------------------------
 * 제한사항
 * 1 ≤ i < j ≤ 100,000
 * 0 ≤ k ≤ 9
 * -------------------------
 *
 * 숫자를 String으로 연결해 해당 문자열의 길이 - 해당 문자에서 k만 제외한 문자열을 하면 k의 개수가 확인됨...
 *
 */

public class CountK {

    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            for (int m = 0; m < String.valueOf(l).length(); m++) {
                if(Integer.parseInt(String.valueOf(String.valueOf(l).charAt(m))) == k) answer++;
//                System.out.println(m + " : " + String.valueOf(l).charAt(m));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CountK test = new CountK();

//        int i = 1;
//        int j = 13;
//        int k = 1;  //  result : 6
//        int i = 10;
//        int j = 50;
//        int k = 5;  //  result : 5
//        int i = 3;
//        int j = 10;
//        int k = 2;  //  result : 0
        int i = 10;
        int j = 20;
        int k = 0;  //  result : 2

        System.out.println("최종 정답 : " + test.solution(i, j, k));
    }
}
