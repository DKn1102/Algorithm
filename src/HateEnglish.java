/**
 * 문제 설명
 * 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
 * 문자열 numbers가 매개변수로 주어질 때,
 * numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
 *
 * -------------------------
 * 제한사항
 * numbers는 소문자로만 구성되어 있습니다.
 * numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.
 * 1 ≤ numbers의 길이 ≤ 50
 * "zero"는 numbers의 맨 앞에 올 수 없습니다.
 * -------------------------
 *
 */

public class HateEnglish {

    public long solution(String numbers) {
        long answer = 0;

        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < str.length; i++) {
            numbers = numbers.replaceAll(str[i], String.valueOf(i));
        }

//        numbers = numbers.replaceAll("zero", "0");
//        numbers = numbers.replaceAll("one", "1");
//        numbers = numbers.replaceAll("two", "2");
//        numbers = numbers.replaceAll("three", "3");
//        numbers = numbers.replaceAll("four", "4");
//        numbers = numbers.replaceAll("five", "5");
//        numbers = numbers.replaceAll("six", "6");
//        numbers = numbers.replaceAll("seven", "7");
//        numbers = numbers.replaceAll("eight", "8");
//        numbers = numbers.replaceAll("nine", "9");

        answer = Long.parseLong(numbers);

        return answer;
    }

    public static void main(String[] args) {
        HateEnglish test = new HateEnglish();

//        String numbers = "onetwothreefourfivesixseveneightnine";    // result : 123456789
        String numbers = "onefourzerosixseven";    // result : 14067

        System.out.println("최종 정답 : " + test.solution(numbers));
    }
}
