
public class MaxSumSubarrayK {

    public static int maxSum(int[] nums, int k) {
        int sum = 0;

        // First window ka sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Window ko slide karo
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxSum(nums, k));
    }
}

