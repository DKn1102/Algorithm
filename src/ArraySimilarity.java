/**
 *
 * 문제 설명
 * 두 배열이 얼마나 유사한지 확인해보려고 합니다.
 * 문자열 배열 s1과 s2가 주어질 때
 * 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ s1, s2의 길이 ≤ 100
 * 1 ≤ s1, s2의 원소의 길이 ≤ 10
 * s1과 s2의 원소는 알파벳 소문자로만 이루어져 있습니다
 * s1과 s2는 각각 중복된 원소를 갖지 않습니다.
 * -------------------------
 *
 *
 * */
public class ArraySimilarity {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if( s1[i].equals(s2[j])) answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ArraySimilarity a = new ArraySimilarity();

//        String[] s1 = {"a", "b", "c"};
//        String[] s2 = {"com", "b", "d", "p", "c"};  // result : 2

        String[] s1 = {"n", "omg"};
        String[] s2 = {"m", "dot"};                 // result : 0

        System.out.println("최종 정답 : " + a.solution(s1, s2));
    }
}
