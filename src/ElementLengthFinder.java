import java.util.Arrays;

/**
 *
 * 문제 설명
 * 문자열 배열 strlist가 매개변수로 주어집니다.
 * strlist 각 원소의 길이를 담은 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ strlist 원소의 길이 ≤ 100
 * strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.
 * -------------------------
 *
 *
 * */

public class ElementLengthFinder {

    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int i = 0;
        for(String str : strlist){
            answer[i++] = str.length();
        }

        return answer;
    }

    public static void main(String[] args) {
        ElementLengthFinder e = new ElementLengthFinder();

//        String[] strlist = {"We", "are", "the", "world!"}; // result : [2, 3, 3, 6]
        String[] strlist = {"I", "Love", "Programmers."};  // result : [1, 4, 12]


        System.out.println("최종 정답 : " + Arrays.toString(e.solution(strlist)));
    }
}
