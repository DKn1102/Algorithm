import java.time.LocalDate;

/**
 *
 * 문제 설명
 * 정수 배열 date1과 date2가 주어집니다.
 * 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다.
 * 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
 *
 * 만약 date1이 date2보다 앞서는 날짜라면 1을,
 * 아니면 0을 return 하는 solution 함수를 완성해 주세요.
 *
 * -------------------------
 * 제한사항
 * 0 ≤ year ≤ 10,000
 * 1 ≤ month ≤ 12
 * day는 month에 따라 가능한 날짜로 주어집니다.
 * -------------------------
 *
 * */

public class DateComparator {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;

        LocalDate dateOne = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateTwo = LocalDate.of(date2[0], date2[1], date2[2]);

        System.out.println("dateOne : " + dateOne);
        System.out.println("dateTwo : " + dateTwo);

        answer = dateOne.isBefore(dateTwo) ? 1 : 0;

        return answer;
    }

    public static void main(String[] args) {
        DateComparator d = new DateComparator();

//        int[] date1 = {2021, 12, 28};
//        int[] date2 = {2021, 12, 29};
        int[] date1 = {1024, 10, 24};
        int[] date2 = {1024, 10, 24};

        System.out.println("최종 정답 : " + d.solution(date1, date2));
    }
}
