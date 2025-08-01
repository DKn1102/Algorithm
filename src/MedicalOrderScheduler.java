import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 문제 설명
 * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
 * 정수 배열 emergency가 매개변수로 주어질 때
 * 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 중복된 원소는 없습니다.
 * 1 ≤ emergency의 길이 ≤ 10
 * 1 ≤ emergency의 원소 ≤ 100
 * -------------------------
 *
 * 응급도를 key값으로 잡고 순서를 value값으로 만든 map을 만든 후
 * emergency 배열에 있는 키값 순서대로 value값을 get해서 배열을 완성한다.
 *
 */

public class MedicalOrderScheduler {

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int j = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();

        int[] copy = emergency.clone();

        Arrays.sort(emergency);

        for(int i = emergency.length-1; i >= 0; i--){
            answer[j++] = emergency[i];
        }


        for (int i = 0; i < answer.length; i++) {
            map.put(answer[i], i+1);
        }

        System.out.println(map);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = map.get(copy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        MedicalOrderScheduler test = new MedicalOrderScheduler();

//        int[] emergency = {3, 76, 24};              // result : [3, 1, 2]
//        int[] emergency = {1, 2, 3, 4, 5, 6, 7};    // result : [7, 6, 5, 4, 3, 2, 1]
        int[] emergency = {30, 10, 23, 6, 100};     // result : [2, 4, 3, 5, 1]

        System.out.println("최종 정답 : " + Arrays.toString(test.solution(emergency)));
    }
}
