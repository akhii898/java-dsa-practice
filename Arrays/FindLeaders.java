import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLeaders {

    public static List<Integer> findLeaders(int[] nums) {

        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = nums[nums.length - 1];

        leaders.add(maxFromRight);

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] > maxFromRight) {
                maxFromRight = nums[i];
                leaders.add(maxFromRight);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {

        int[] nums = {16, 17, 4, 3, 5, 2};

        System.out.println(findLeaders(nums));
    }
}