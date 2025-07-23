import java.util.Arrays;

/**
 *
 * 문제 설명
 * 직사각형 형태의 그림 파일이 있고,
 * 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다.
 * 이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때,
 * 이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록
 * 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 *
 * -------------------------
 * 제한사항
 * 1 ≤ picture의 길이 ≤ 20
 * 1 ≤ picture의 원소의 길이 ≤ 20
 * 모든 picture의 원소의 길이는 같습니다.
 * picture의 원소는 '.'과 'x'로 이루어져 있습니다.
 * 1 ≤ k ≤ 10
 * -------------------------
 *
 * */

public class PictureZoom {

    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        // picture에 있는 String 값을 char 배열로 변환하여 char[i] 값 마다 * n 을 해서 이어 붙인다.
        for (int i = 0; i < picture.length; i++) {
            String charStr = "";
            char[] chars = picture[i].toCharArray();

            for (int j = 0; j < chars.length; j++) {
                for (int l = 0; l < k; l++) {
                    charStr += String.valueOf(chars[j]);
                }
            }
            picture[i] = charStr;

            System.out.println("charStr : " + charStr);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = picture[i/k];
        }

        System.out.println("chars : " + Arrays.toString(picture));

        return answer;
    }

    public static void main(String[] args) {
        PictureZoom c = new PictureZoom();

//        String[] picture =  {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};    // ["..xxxx......xxxx..", "..xxxx......xxxx..", "xx....xx..xx....xx", "xx....xx..xx....xx", "xx......xx......xx", "xx......xx......xx", "..xx..........xx..", "..xx..........xx..", "....xx......xx....", "....xx......xx....", "......xx..xx......", "......xx..xx......", "........xx........", "........xx........"]
//        int k = 2;
        String[] picture =  {"x.x", ".x.", "x.x"};  // ["xxx...xxx", "xxx...xxx", "xxx...xxx", "...xxx...", "...xxx...", "...xxx...", "xxx...xxx", "xxx...xxx", "xxx...xxx"]
        int k = 3;


        System.out.println("최종 정답 : " + Arrays.toString(c.solution(picture, k)));
    }
}
