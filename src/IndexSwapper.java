import java.util.Arrays;

/**
 * 문제 설명
 * 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
 * my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 * -------------------------
 * 제한사항
 * 1 < my_string의 길이 < 100
 * 0 ≤ num1, num2 < my_string의 길이
 * my_string은 소문자로 이루어져 있습니다.
 * num1 ≠ num2
 * -------------------------
 */

public class IndexSwapper {

    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        String[] str = my_string.split("");

        String str1 = str[num1];
        String str2 = str[num2];

        str[num2] = str1;
        str[num1] = str2;

        for(String string : str){
            answer += string;
        }

        System.out.println("str : " + Arrays.toString(str));

        return answer;
    }

    public static void main(String[] args) {
        IndexSwapper test = new IndexSwapper();

//        String my_string = "hello";
//        int num1 = 1;
//        int num2 = 2;   // result : "hlelo"
        String my_string = "I love you";
        int num1 = 3;
        int num2 = 6;   // result : "I l veoyou"

        System.out.println("최종 정답 : " + test.solution(my_string, num1, num2));
    }
}
