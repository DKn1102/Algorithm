import java.util.Arrays;

/**
 * 문제 설명
 * 문자열 my_string이 매개변수로 주어집니다.
 * my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
 * my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 1,000
 * 1 ≤ my_string 안의 자연수 ≤ 1000
 * 연속된 수는 하나의 숫자로 간주합니다.
 * 000123과 같이 0이 선행하는 경우는 없습니다.
 * 문자열에 자연수가 없는 경우 0을 return 해주세요.
 * -------------------------
 */

public class HiddenNumberSum2 {
    public int solution(String my_string) {
        int answer = 0;

        my_string = my_string.replaceAll("[A-Z|a-z]", " ");
        String[] str = my_string.split(" ");

        System.out.println("str : " + Arrays.toString(str));

        for(String num : str){
            if(num.equals("")) continue;
            answer += Integer.parseInt(num);
        }

        return answer;
    }

    public static void main(String[] args) {
        HiddenNumberSum2 test = new HiddenNumberSum2();

//        String my_string = "aAb1B2cC34oOp"; //  result : 37
        String my_string = "1a2b3c4d123Z";  //  result : 133

        System.out.println("최종 정답 : " + test.solution(my_string));
    }
}
