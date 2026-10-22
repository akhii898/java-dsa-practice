
import java.util.HashMap;

class checkSubarraySum{
    public boolean CheckSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            int remainder = prefixSum % k;

            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        checkSubarraySum sol = new checkSubarraySum();

        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;

        System.out.println(sol.CheckSubarraySum(nums, k));
    }
}

