/**
 *
 * 문제 설명
 * 가위는 2 바위는 0 보는 5로 표현합니다.
 * 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
 * rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을
 * return하도록 solution 함수를 완성해보세요.
 *
 * -------------------------
 * 제한사항
 * 0 < rsp의 길이 ≤ 100
 * rsp와 길이가 같은 문자열을 return 합니다.
 * rsp는 숫자 0, 2, 5로 이루어져 있습니다.
 * -------------------------
 *
 *
 * */
public class RockScissorsPaper {
    public String solution(String rsp) {
        String answer = "";
        char[] chars = rsp.toCharArray();

        for (char str : chars){
            if (str == '0') answer += "5";
            else if (str == '2') answer += "0";
            else answer += "2";
        }

        return answer;
    }

    public static void main(String[] args) {
        RockScissorsPaper r = new RockScissorsPaper();

//        String rsp = "2"; // result : "0"
        String rsp = "205"; // result : "052"

        System.out.println("최종 정답 : " + r.solution(rsp));
    }
}
