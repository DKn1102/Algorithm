import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 문제 설명
 * 문자열 my_string이 매개변수로 주어집니다.
 * my_string에서 중복된 문자를 제거하고
 * 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ my_string ≤ 110
 * my_string은 대문자, 소문자, 공백으로 구성되어 있습니다.
 * 대문자와 소문자를 구분합니다.
 * 공백(" ")도 하나의 문자로 구분합니다.
 * 중복된 문자 중 가장 앞에 있는 문자를 남깁니다.
 * -------------------------
 *
 * LinkedHashSet 방법과 일반 loof 문을 사용하여 구현해봄
 *
 */

public class RemoveDuplicateCharacters {

    public String solution(String my_string) {

//        for (int i = 0; i < my_string.length(); i++) {
//            for (int j = i+1; j < my_string.length(); j++) {
//                if (my_string.charAt(i) == my_string.charAt(j)) {
//                    my_string = my_string.substring(0, j) + my_string.substring(j+1, my_string.length());
//                    j--;
//                }
//            }
//        }

        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(answer));

        set.stream().count();

        System.out.println("set : " + set);
        System.out.println("set : " + String.join("", set));

        return my_string;
    }

    public static void main(String[] args) {
        RemoveDuplicateCharacters test = new RemoveDuplicateCharacters();

//        String my_string = "people";    // result : "peol"
        String my_string = "We are the world";    // result : "We arthwold"

        System.out.println("최종 정답 : " + test.solution(my_string));
    }
}
