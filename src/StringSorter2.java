import java.util.Arrays;

/**
 * 문제 설명
 * 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
 * my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 * -------------------------
 * 제한사항
 * 0 < my_string 길이 < 100
 * -------------------------
 */

public class StringSorter2 {

    public String solution(String my_string) {
        String answer = "";
        char[] chars = my_string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) chars[i] = Character.toLowerCase(chars[i]);
        }

        Arrays.sort(chars);

        answer = String.valueOf(chars);

        return answer;
    }

    public static void main(String[] args) {
        StringSorter2 test = new StringSorter2();

//        String my_string = "Bcad";  // result : "abcd"
//        String my_string = "heLLo";  // result : "ehllo"
        String my_string = "Python";  // result : "hnopty"

        System.out.println("최종 정답 : " + test.solution(my_string));
    }
}
