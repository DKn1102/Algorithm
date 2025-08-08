import java.util.Arrays;

/**
 * 문제 설명
 * 머쓱이는 RPG게임을 하고 있습니다.
 * 게임에는 up, down, left, right 방향키가 있으며 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다.
 * 예를 들어 [0,0]에서
 * up을 누른다면 캐릭터의 좌표는 [0, 1],
 * down을 누른다면 [0, -1],
 * left를 누른다면 [-1, 0],
 * right를 누른다면 [1, 0]입니다.
 * 머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다.
 * 캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에
 * 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해주세요.
 *
 * [0, 0]은 board의 정 중앙에 위치합니다.
 * 예를 들어 board의 가로 크기가 9라면
 * 캐릭터는 왼쪽으로 최대 [-4, 0]까지 오른쪽으로 최대 [4, 0]까지 이동할 수 있습니다.
 *
 * -------------------------
 * 제한사항
 * board은 [가로 크기, 세로 크기] 형태로 주어집니다.
 * board의 가로 크기와 세로 크기는 홀수입니다.
 * board의 크기를 벗어난 방향키 입력은 무시합니다.
 * 0 ≤ keyinput의 길이 ≤ 50
 * 1 ≤ board[0] ≤ 99
 * 1 ≤ board[1] ≤ 99
 * keyinput은 항상 up, down, left, right만 주어집니다.
 * -------------------------
 */

public class CharacterPositionTracker {

    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        int board_x = board[0];
        int board_y = board[1];

        int board_x_half = board_x / 2;
        int board_y_half = board_y / 2;

        int x = 0;
        int y = 0;

        if(keyinput.length == 0){
            return new int[] {0, 0};
        }

        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "up":
                    if ((Math.abs(y) < board_y_half && board_y_half >= 1) || y < 0) y += 1;
                    break;
                case "down":
                    if ((Math.abs(y) < board_y_half && board_y_half >= 1) || y > 0) y -= 1;
                    break;
                case "left":
                    if ((Math.abs(x) < board_x_half && board_x_half >= 1) || x > 0) x -= 1;
                    break;
                case "right":
                    if ((Math.abs(x) < board_x_half && board_x_half >= 1) || x < 0) x += 1;
                    break;
            }
        }
        answer = new int[] {x, y};

        return answer;
    }

    public static void main(String[] args) {
        CharacterPositionTracker test = new CharacterPositionTracker();

//        String[] keyinput = {"left", "right", "up", "right", "right"};
//        int[] board = {11, 11}; // result : [2, 1]
//        String[] keyinput = {"down", "down", "down", "down", "down"};
//        int[] board = {7, 9}; // result : [0, -4]
//        String[] keyinput = {"up", "up", "up", "down"};
//        int[] board = {3,3}; // result : [0, 0]
//        String[] keyinput = {"down", "down", "down", "up"};
//        int[] board = {3,3}; // result : [0, 0]
//        String[] keyinput = {"left", "left", "left", "right"};
//        int[] board = {3,3}; // result : [0, 0]
//        String[] keyinput = {"right", "right", "right", "left"};
//        int[] board = {3,3}; // result : [0, 0]
//        String[] keyinput = {"right", "right", "right", "right", "right", "left"};
//        int[] board = {9,5}; // result : [3, 0]
//        String[] keyinput = {"left", "left", "left", "left", "left", "right"};
//        int[] board = {9,5}; // result : [-3, 0]
//        String[] keyinput = {"right", "up", "left", "down", "down", "down", "left"};
//        int[] board = {1,99}; // result : [0, -2]
        String[] keyinput = {"left", "left", "left", "left", "right", "right", "right", "right"};
        int[] board = {5,5}; // result : [2, 0]
//        String[] keyinput = {"left", "left", "right", "left"};
//        int[] board = {3,3}; // result : [-1, 0]


        System.out.println("최종 정답 : " + Arrays.toString(test.solution(keyinput, board)));
    }
}
