
/**
 *
 * 문제 설명
 * 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
 * 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와
 * 머쓱이의 키 height가 매개변수로 주어질 때,
 * 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ array의 길이 ≤ 100
 * 1 ≤ height ≤ 200
 * 1 ≤ array의 원소 ≤ 200
 * -------------------------
 *
 *
 * */
public class TallerThanMe {

    public int solution(int[] array, int height) {
        int answer = 0;

        for(int hei : array){
            if (height < hei) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        TallerThanMe t = new TallerThanMe();

//        int[] array = {149, 180, 192, 170};
//        int height = 167;                   // result : 3
//
        int[] array = {180, 120, 140};
        int height = 190;                 // result : 0

        System.out.println("최종 정답 : " + t.solution(array, height));
    }
}
