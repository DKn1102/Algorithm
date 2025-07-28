import java.util.Arrays;

/**
 *
 * 문제 설명
 * 문자열 my_string이 매개변수로 주어질 때,
 * my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를
 * return 하도록 solution 함수를 작성해보세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 100
 * my_string에는 숫자가 한 개 이상 포함되어 있습니다.
 * my_string은 영어 소문자 또는 0부터 9까지의 숫자로 이루어져 있습니다.
 * -------------------------
 *
 * 1. replaceAll 후 split 처리하여 String 배열로 만들어 풀이
 * 2. replaceAll 후 toCharArray를 통해 char 배열로 만들어 풀이
 * */

public class StringSort1 {
    public int[] solution(String my_string) {
        int[] answer = {};
        int i = 0;

        String[] splitStr = my_string.replaceAll("[a-z]", "").split("");

        Arrays.sort(splitStr);

        answer = new int[splitStr.length];

        for (String str : splitStr){
            answer[i++] = Integer.parseInt(str);
        }
//        my_string = my_string.replaceAll("[a-z]", "");
//
//        chars = my_string.toCharArray();
//
//        Arrays.sort(chars);
//
//        answer = new int[chars.length];
//
//        for (char cha : chars){
//            answer[i++] = Integer.parseInt(String.valueOf(cha));
//        }

        return answer;
    }

    public static void main(String[] args) {
        StringSort1 s = new StringSort1();

        String my_string = "hi12392";   // result : [1, 2, 2, 3, 9]
//        String my_string = "p2o4i8gj2";   // result : [2, 2, 4, 8]
//        String my_string = "abcde0";   // result : [0]

        System.out.println("최종 정답 : " + Arrays.toString(s.solution(my_string)));
    }
}
