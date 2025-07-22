import java.util.Arrays;

/**
 *
 * 문제 설명
 * 알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
 * 알파벳 순서에서 "l"보다 앞서는 모든 문자를
 * "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ myString ≤ 100,000
 * myString은 알파벳 소문자로 이루어진 문자열입니다.
 * -------------------------
 *
 *
 *
 * */
public class ReplaceBeforeL {

    public String solution(String myString) {
        String answer = "";

        char[] chars = myString.toCharArray();

        int l = 'l';

        for (int i = 0; i < chars.length; i++) {
            int num = chars[i];

            System.out.println("chars num : " + num);

            if(num < l){
                chars[i] = 'l';
            }
            answer += chars[i];
        }

        System.out.println("chars : " + Arrays.toString(chars));

        return answer;
    }

    public static void main(String[] args) {
        ReplaceBeforeL l = new ReplaceBeforeL();

//        String myString = "abcdevwxyz";
        String myString = "jjnnllkkmm";

        System.out.println("최종 정답 : " + l.solution(myString));

    }
}
