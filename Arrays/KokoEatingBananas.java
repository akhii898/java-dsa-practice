
public class KokoEatingBananas {

    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canFinish(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static boolean canFinish(int[] piles, int h, int speed) {
        int hours = 0;

        for (int pile : piles) {
            hours += pile / speed;

            if (pile % speed != 0) {
                hours++;
            }

            if (hours > h) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        System.out.println(minEatingSpeed(piles, h));
    }
}

