import java.util.Arrays;

/**
 *
 * 문제 설명
 * 정수 배열 arr이 매개변수로 주어집니다.
 * arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
 * arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ arr의 길이 ≤ 1,000
 * 1 ≤ arr의 원소 ≤ 1,000
 * -------------------------
 *
 * 1. arr의 길이를 파악한다.
 * 2. 2의 거듭제곱의 값과 arr의 길이를 비교하여 거듭제곱 값이 arr의 길이보다 크거나 같을 때의 값을 answer의 크기로 설정한다.
 * 이 후 arr의 값을 copy하여 answer에 대입한다.
 *
 *
 * Tip : Arrays.copyOf(a, b);
 *
 * */

public class PowerOfTwoArrayResizer {

    public int[] solution(int[] arr) {
        int[] answer = {};
        int num = 1;

        while (num < arr.length) {
            num *= 2;
        }

        answer = new int[num];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        System.out.println("num : " + num);

        return answer;
    }

    public static void main(String[] args) {
        PowerOfTwoArrayResizer p = new PowerOfTwoArrayResizer();

//        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr = {58, 172, 746, 89};

        System.out.println("정답 : " + Arrays.toString(p.solution(arr)));
    }
}
