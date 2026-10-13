import java.util.Arrays;

public class MoveNegatives {

    public static void moveNegatives(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, -2, 3, -4, 5, -6, 7};

        moveNegatives(nums);

        System.out.println(Arrays.toString(nums));
    }
}
