import java.util.Arrays;

/**
 * 문제 설명
 * 문자열 before와 after가 매개변수로 주어질 때,
 * before의 순서를 바꾸어 after를 만들 수 있으면 1을,
 * 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
 *
 * -------------------------
 * 제한사항
 * 0 < before의 길이 == after의 길이 < 1,000
 * before와 after는 모두 소문자로 이루어져 있습니다.
 * -------------------------
 */

public class MakeBfromA {

    public int solution(String before, String after) {
        int answer = 0;

        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        Arrays.compare(beforeArr, afterArr);

        answer = Arrays.equals(beforeArr, afterArr) ? 1 : 0;

        return answer;
    }

    public static void main(String[] args) {
        MakeBfromA test = new MakeBfromA();

//        String before = "olleh";
//        String after = "hello"; // result : 1
        String before = "allpe";
        String after = "apple"; // result : 0

        System.out.println("최종 정답 : " + test.solution(before, after));
    }
}
