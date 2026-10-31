
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Arrays;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a min-heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        // Step 3: Keep only k most frequent elements
        for (int num : map.keySet()) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Step 4: Store the answer
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;

        System.out.println(
            "Output: " + Arrays.toString(topKFrequent(nums1, k1))
        );

        int[] nums2 = {1};
        int k2 = 1;

        System.out.println(
            "Output: " + Arrays.toString(topKFrequent(nums2, k2))
        );

        int[] nums3 = {4, 4, 4, 6, 6, 7, 7, 7, 7};
        int k3 = 2;

        System.out.println(
            "Output: " + Arrays.toString(topKFrequent(nums3, k3))
        );
    }
}
