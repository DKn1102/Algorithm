/**
 * 문제 설명
 * my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
 * 문자열 my_string이 매개변수로 주어질 때,
 * 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 연산자는 +, -만 존재합니다.
 * 문자열의 시작과 끝에는 공백이 없습니다.
 * 0으로 시작하는 숫자는 주어지지 않습니다.
 * 잘못된 수식은 주어지지 않습니다.
 * 5 ≤ my_string의 길이 ≤ 100
 * my_string을 계산한 결과값은 1 이상 100,000 이하입니다.
 * my_string의 중간 계산 값은 -100,000 이상 100,000 이하입니다.
 * 계산에 사용하는 숫자는 1 이상 20,000 이하인 자연수입니다.
 * my_string에는 연산자가 적어도 하나 포함되어 있습니다.
 * return type 은 정수형입니다.
 * my_string의 숫자와 연산자는 공백 하나로 구분되어 있습니다.
 * -------------------------
 */

public class StringCalculator {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.split(" ");

        for(int i = 0; i < str.length; i += i==0 ? 3 : 2){
            if(i==0){
                answer += "+".equals(str[i+1]) ? Integer.parseInt(str[i]) + Integer.parseInt(str[i+2]) : Integer.parseInt(str[i]) - Integer.parseInt(str[i+2]);
            }else {
                answer = "+".equals(str[i]) ? answer + Integer.parseInt(str[i+1]) : answer - Integer.parseInt(str[i+1]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StringCalculator test = new StringCalculator();

//        String my_string = "3 + 4"; // result : 7
//        String my_string = "3 + 4 - 3"; // result : 4
//        String my_string = "3 + 4 - 3 + 5 - 3"; // result : 6
        String my_string = "3 + 4 - 3 + 5 - 3 - 3 + 1"; // result : 4

        System.out.println("최종 정답 : " + test.solution(my_string));
    }
}
