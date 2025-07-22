import java.util.ArrayList;
import java.util.Arrays;

/**
 * 문제 설명
 * 랜덤으로 서로 다른 k개의 수를 저장한 배열을 만드려고 합니다.
 * 적절한 방법이 떠오르지 않기 때문에 일정한 범위 내에서 무작위로 수를 뽑은 후
 * 지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식으로 만들기로 합니다.
 *
 * 이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고
 * 실제 만들어질 길이 k의 배열을 예상해봅시다.
 *
 * 정수 배열 arr가 주어집니다.
 * 문제에서의 무작위의 수는 arr에 저장된 순서대로 주어질 예정이라고 했을 때
 * 완성될 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.
 *
 * -----------------------------------
 * 제한사항
 * 1 ≤ arr의 길이 ≤ 100,000
 * 0 ≤ arr의 원소 ≤ 100,000
 * 1 ≤ k ≤ 1,000
 * -----------------------------------
 *
 * 배열 첫번째와 두번째 값을 비교하여 같지 않으면 첫번째 값을 ArrayList에 추가
 * 배열 첫번째와 두번째 값을 비교하여 같으면 continue;
 *
 * 위 배열을 만든 후
 *
 * answer의 길이가 k의 길이보다 작으면 위 배열에서 k의 배열 만큼 -1을 추가한다.
 *
 * */
public class RandomKNumberPicker {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        ArrayList<Integer> test = getIntegers(arr);

        // 루프를 돌며 추가된 배열을 정답에 순서대로 인입한 후 기존 배열보다 인덱스 값이 더 크면 해당 인덱스 값에 -1을 추가
        for(int j=0; j < k; j++){
            if (j >= test.size()) {
                answer[j] = -1;
            }else{
                answer[j] = test.get(j);
            }
        }

        System.out.println("test : "+ test);

        return answer;
    }

    private static ArrayList<Integer> getIntegers(int[] arr) {
        ArrayList<Integer> test = new ArrayList<Integer>();

        boolean flag = false;

        // 가변배열 ArrayList를 이용하여 중복되지 않는 숫자들만 해당 배열에 추가
        for (int i = 0; i < arr.length; i++) {
            if(i == 0) {
                test.add(arr[i]);

            }else{
                for(int num : test){
                    flag = false;
                    if(num == arr[i]) break;

                    flag = true;

                }
                if(flag){
                    test.add(arr[i]);
                }
            }
        }
        return test;
    }

    public static void main(String[] args) {
        RandomKNumberPicker r = new RandomKNumberPicker();
//        int arr[] = {0,1,1,2,2,3};
//        int i   = 3;
        int arr[] = {0, 1, 1, 1, 1};
        int i   = 4;

//        int arr[] = {0,1,0,1};
//        int i     = 4;

        System.out.println("정답 : " + Arrays.toString(r.solution(arr, i)));
    }
}
