import java.util.HashMap;

/**
 *
 * 문자열 배열 strArr이 주어집니다.
 * strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때
 * 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
 *
 * -------------------------
 * 제한사항
 *  1 ≤ strArr의 길이 ≤ 100,000
 *  1 ≤ strArr의 원소의 길이 ≤ 30
 *  strArr의 원소들은 알파벳 소문자로 이루어진 문자열입니다.
 * -------------------------
 *
 * // O(N) 방식
 * 1. HashMap 사용하여 문자열 길이 값을 Key로 사용한다.
 * 2. 이후 HashMap의 Key의 최댓값의 value를 리턴한다.
 *
 * // 아래 방법은 O(N²) 방식이라 너무 오래걸림
 * 1. 버블정렬하여 숫자(문자열 길이)를 나열한다.
 * 2. 시작 숫자와 다음 숫자를 비교한다.
 *      - 같은 경우 카운트를 1 더하고 다음 인덱스로 넘어간다.
 *      - 다른 경우 다른 카운트(기본: 0)를 1더하고 다음 인덱스로 넘어간다.
 *      - 이 때, 다른 경우 이전 카운트와, 다른 카운트를 비교하여 큰 카운트를 이전 카운트로 교체한다.
 * 3. 큰 카운트를 리턴한다.
 *
 *
 * */

public class StringGrouper {

    public int solution(String[] strArr) {
        /*int count    = 1;   // 이전 카운트1
        int bubbleIndex = 1;
        String str = "";    // 버블정렬 문자열 담는 변수

        // 버블 정렬 배열
        int[] bubble = new int[strArr.length];

        // 버블정렬
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = 0; j < strArr.length - 1 - i; j++) {
                if(strArr[j].length() > strArr[j+1].length()){
                    str = strArr[j];
                    strArr[j] = strArr[j+1];
                    strArr[j+1] = str;
                }
            }
            System.out.println("버블 배열 : " + Arrays.toString(strArr));
        }

        // bubble 배열 삽입
        for (int i = 0; i < strArr.length; i++) {
            bubble[i] = strArr[i].length();
        }

        System.out.println("버블정렬 : " + Arrays.toString(bubble));

        for (int i = 0; i < bubble.length; i++) {
            if(bubble.length-1 == i) break;

            if(bubble[i] == bubble[bubbleIndex++]){
                count++;
            }else{
                count = 1;
            }
            if(count > answer){
                answer = count;
            }
        }

        System.out.println("answer 값 : " + answer);*/
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(String str : strArr){
            map.put(str.length(), map.getOrDefault(str.length(), 0) + 1);

            answer = Math.max(answer, map.get(str.length()));

        }

        return answer;
    }

    public static void main(String[] args) {
        StringGrouper g = new StringGrouper();

//        String[] strArr = {"a","bc","d","efg","hi"};
        String[] strArr = {"a", "bc","d","efg","hi", "a", "bd"};

        System.out.println("정답 : " + g.solution(strArr));
    }
}
