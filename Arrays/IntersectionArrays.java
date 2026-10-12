import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        int[] answer = new int[result.size()];
        int i = 0;

        for (int num : result) {
            answer[i++] = num;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersection(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}
