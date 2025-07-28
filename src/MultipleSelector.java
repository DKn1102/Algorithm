import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * 문제 설명
 * 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
 * numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ n ≤ 10,000
 * 1 ≤ numlist의 크기 ≤ 100
 * 1 ≤ numlist의 원소 ≤ 100,000
 * -------------------------
 *
 *
 * */

public class MultipleSelector {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : numlist){
            if(num%n==0) list.add(num);
        }

        answer = new int[list.size()];

        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        MultipleSelector m = new MultipleSelector();

//        int n = 3;
//        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};  // result : [6, 9, 12]
        int n = 5;
        int[] numlist = {1, 9, 3, 10, 13, 5};  // result : [10, 5]
//        int n = 12;
//        int[] numlist = {2, 100, 120, 600, 12, 12};  // result : [120, 600, 12, 12]


        System.out.println("최종 정답 : " + Arrays.toString(m.solution(n, numlist)));
    }
}
