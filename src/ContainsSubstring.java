/**
 *
 * 문제 설명
 * 문자열 str1, str2가 매개변수로 주어집니다.
 * str1 안에 str2가 있다면 1을
 * 없다면 2를 return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ str1의 길이 ≤ 100
 * 1 ≤ str2의 길이 ≤ 100
 * 문자열은 알파벳 대문자, 소문자, 숫자로 구성되어 있습니다.
 * -------------------------
 *
 *
 * */

public class ContainsSubstring {

    public int solution(String str1, String str2) {
        int answer = 0;

        answer = str1.contains(str2) ? 1 : 2;

        return answer;
    }

    public static void main(String[] args) {
        ContainsSubstring c = new ContainsSubstring();

//        String str1 = "ab6CDE443fgh22iJKlmn1o";
//        String str2 = "6CD";
//        String str1 = "ppprrrogrammers";
//        String str2 = "pppp";
        String str1 = "AbcAbcA";
        String str2 = "AAA";

        System.out.println("최종 정답 : " + c.solution(str1, str2));
    }
}
