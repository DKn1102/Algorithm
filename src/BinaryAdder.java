/**
 * 문제 설명
 * 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
 * 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * return 값은 이진수를 의미하는 문자열입니다.
 * 1 ≤ bin1, bin2의 길이 ≤ 10
 * bin1과 bin2는 0과 1로만 이루어져 있습니다.
 * bin1과 bin2는 "0"을 제외하고 0으로 시작하지 않습니다.
 * -------------------------
 */

public class BinaryAdder {

    public String solution(String bin1, String bin2) {

        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }

    public static void main(String[] args) {
        BinaryAdder test = new BinaryAdder();

//        String bin1 = "10";
//        String bin2 = "11";	// result : "101"
        String bin1 = "1001";
        String bin2 = "1111";	// result : "11000"

        System.out.println("최종 정답 : " + test.solution(bin1, bin2));
    }
}
