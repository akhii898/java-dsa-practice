
import java.util.HashMap;

public class NumSubmatrixSumTarget {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;

        for (int top = 0; top < rows; top++) {
            int[] colSum = new int[cols];

            for (int bottom = top; bottom < rows; bottom++) {

                for (int c = 0; c < cols; c++) {
                    colSum[c] += matrix[bottom][c];
                }

                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);

                int prefixSum = 0;

                for (int sum : colSum) {
                    prefixSum += sum;

                    count += map.getOrDefault(
                        prefixSum - target, 0
                    );

                    map.put(
                        prefixSum,
                        map.getOrDefault(prefixSum, 0) + 1
                    );
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        NumSubmatrixSumTarget sol = new NumSubmatrixSumTarget();

        int[][] matrix = {
            {0, 1, 0},
            {1, 1, 1},
            {0, 1, 0}
        };

        int target = 2;

        System.out.println(
            sol.numSubmatrixSumTarget(matrix, target)
        );
    }
}

