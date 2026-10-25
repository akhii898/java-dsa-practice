public class MaximumCircularSubarray {

    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;

        int maxEnding = 0;
        int maxSum = nums[0];

        int minEnding = 0;
        int minSum = nums[0];

        for (int num : nums) {
            totalSum += num;

            // Maximum subarray sum (Kadane)
            maxEnding = Math.max(num, maxEnding + num);
            maxSum = Math.max(maxSum, maxEnding);

            // Minimum subarray sum
            minEnding = Math.min(num, minEnding + num);
            minSum = Math.min(minSum, minEnding);
        }

        // All elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        int circularMax = totalSum - minSum;

        return Math.max(maxSum, circularMax);
    }

    public static void main(String[] args) {
        MaximumCircularSubarray sol = new MaximumCircularSubarray();

        int[] nums = {5, -3, 5};

        System.out.println(sol.maxSubarraySumCircular(nums));
    }
}