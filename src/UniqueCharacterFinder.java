import java.util.Arrays;

/**
 * 문제 설명
 * 문자열 s가 매개변수로 주어집니다.
 * s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 * 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 *
 * -------------------------
 * 제한사항
 * 0 < s의 길이 < 1,000
 * s는 소문자로만 이루어져 있습니다.
 * -------------------------
 */

public class UniqueCharacterFinder {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        for (int i = 0; i < s.length(); i++) {
            System.out.println("s : " + s);
            System.out.println("str[i] : " + str[i]);
            System.out.println("end : " + s.lastIndexOf(str[i]));
            if(s.indexOf(str[i]) == s.lastIndexOf(str[i])) answer += str[i];
        }

        char[] chars = answer.toCharArray();
        Arrays.sort(chars);

        answer = String.valueOf(chars);

        return answer;
    }

    public static void main(String[] args) {
        UniqueCharacterFinder test = new UniqueCharacterFinder();

//        String s = "abcabcadc"; // "d"
//        String s = "abdc"; // "abcd"
        String s = "hellllo"; // "eho"

        System.out.println("최종 정답 : " + test.solution(s));
    }
}
