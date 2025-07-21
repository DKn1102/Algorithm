import java.util.Arrays;

public class TwoSum{

    static class Solution {
        public static int[] solution(int[] nums, int target) {
            int[] output = new int[2];
            for(int i=0; i<nums.length; i++){
                int i_val = nums[i];
                for(int j=0; j<nums.length; j++){
                    int j_val = nums[j];
                    if(i == j) break;
                    if(i_val + j_val == target){
                        output[0] = i;
                        output[1] = j;
                        return output;
                    }
                }
            }
            return output;
        }
}




    public static void main(String[] args) {
        TwoSum.Solution s = new TwoSum.Solution();

//        int[] arr = {0, 1, 1, 1, 0};
        int[] arr = {0, 1, 1, 0};

        int i = 0;

        System.out.println("정답 : " + Arrays.toString(s.solution(arr, i)));
    }
}