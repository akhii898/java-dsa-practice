
public class MaximumAbsoluteSum {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnding = 0;
        int minEnding = 0;

        int maxSum = 0;
        int minSum = 0;

        for (int num : nums) {
            maxEnding = Math.max(0, maxEnding + num);
            maxSum = Math.max(maxSum, maxEnding);

            minEnding = Math.min(0, minEnding + num);
            minSum = Math.min(minSum, minEnding);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }

    public static void main(String[] args) {
        MaximumAbsoluteSum sol = new MaximumAbsoluteSum();

        int[] nums = {1, -3, 2, 3, -4};

        System.out.println(sol.maxAbsoluteSum(nums));
    }
}
