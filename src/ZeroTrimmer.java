
/**
 *
 * 문제 설명
 * 정수로 이루어진 문자열 n_str이 주어질 때,
 * n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 *
 * -------------------------
 * 제한사항
 * 2 ≤ n_str ≤ 10
 * n_str이 "0"으로만 이루어진 경우는 없습니다.
 * -------------------------
 *
 *
 *
 * */

public class ZeroTrimmer {

    public String solution(String n_str) {
        String answer = n_str;

        for (int i = 0; i < n_str.length(); i++) {
            if(answer.startsWith("0")){
                answer = answer.replaceFirst("0", "");
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ZeroTrimmer z = new ZeroTrimmer();

//        String n_str = "0010";  // 10
        String n_str = "854020";  // 854020

        System.out.println("최종 정답 : " + z.solution(n_str));
    }
}
