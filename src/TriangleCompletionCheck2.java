/**
 * 문제 설명
 * 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
 *
 * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
 * 삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
 * 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 * -------------------------
 * 제한사항
 * sides의 원소는 자연수입니다.
 * sides의 길이는 2입니다.
 * 1 ≤ sides의 원소 ≤ 1,000
 * -------------------------
 *
 * min * 2 - 1
 *
 */

public class TriangleCompletionCheck2 {

    public int solution(int[] sides) {
        int answer = 0;

        int max   = Math.max(sides[0], sides[1]);
        int min   = Math.min(sides[0], sides[1]);

        int sum   = sides[0] + sides[1];

        // 나머지 한 변이 가장 긴 변인 경우 : loop if (i < sum) { max < i < sum }
        for(int i = 1; i < sum; i++){
            if(i > max && i < sum) answer++;
        }
        System.out.println("answer : " + answer);

        // 가장 긴 변이 max인 경우 : loop if (i <= max) { max-min+1 <= i <= max }
        for(int i = 1; i <= max; i++){
            if(i >= max - min + 1 && i <= max) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        TriangleCompletionCheck2 test = new TriangleCompletionCheck2();

//        int[] sides = {1, 2}; // result : 1
        int[] sides = {3, 6}; // result : 5
//        int[] sides = {11, 7}; // result : 13

        System.out.println("최종 정답 : " + test.solution(sides));
    }
}
