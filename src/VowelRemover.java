/**
 *
 * 문제 설명
 * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
 * 문자열 my_string이 매개변수로 주어질 때
 * 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * my_string은 소문자와 공백으로 이루어져 있습니다.
 * 1 ≤ my_string의 길이 ≤ 1,000
 * -------------------------
 *
 * 정규식으로도 변환 가능
 * answer = my_string.replaceAll("[aeiou]", "");
 *
 * */

public class VowelRemover {
    public String solution(String my_string) {
        String answer = "";
        char[] chars = my_string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'a' || chars[i] == 'e' ||
                    chars[i] == 'i' || chars[i] == 'o' ||
                    chars[i] == 'u') continue;
            answer += chars[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        VowelRemover v = new VowelRemover();

//        String my_string = "bus";   // result : "bs"
        String my_string = "nice to meet you";   // result : "nc t mt y"


        System.out.println("최종 정답 : " + v.solution(my_string));
    }

}
