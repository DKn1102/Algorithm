/**
 * 문제 설명
 * 문자열 my_string이 매개변수로 주어질 때,
 * 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
 * -------------------------
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 1,000
 * my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
 * -------------------------
 */

public class CaseConverter {

    public String solution(String my_string) {
        String answer = "";
        char[] chars = my_string.toCharArray();

        for(char str : chars){
            if(Character.isUpperCase(str)){ // 문자가 대문자인지 판별 true : 대문자, false : 소문자
                answer += Character.toLowerCase(str);
            }else {
                answer += Character.toUpperCase(str);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CaseConverter test = new CaseConverter();

//        String my_string = "cccCCC";    // result : "CCCccc"
        String my_string = "abCdEfghIJ";    // result : "ABcDeFGHij"

        System.out.println("최종 정답 : " + test.solution(my_string));
    }
}
