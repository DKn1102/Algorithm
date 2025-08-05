import java.util.Arrays;

/**
 * 문제 설명
 * 문자열 my_str과 n이 매개변수로 주어질 때,
 * my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ my_str의 길이 ≤ 100
 * 1 ≤ n ≤ my_str의 길이
 * my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
 * -------------------------
 */

public class StringSplitter {

    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() / n) + (my_str.length() % n > 0? 1 : 0)];

        for (int i = 0; i < answer.length; i++) {
            if (my_str.length() < n) {
                answer[i] = my_str.substring(0, my_str.length()); break;
            };
            answer[i] = my_str.substring(0, n);
            my_str = my_str.substring(n);
        }

        return answer;
    }

    public static void main(String[] args) {
        StringSplitter test = new StringSplitter();

//        String my_str = "abc1Addfggg4556b";
//        int n = 6;  // result : ["abc1Ad", "dfggg4", "556b"]
        String my_str = "abcdef123";
        int n = 3;  // result : ["abc", "def", "123"]

        System.out.println("최종 정답 : " + Arrays.toString(test.solution(my_str, n)));
    }
}
