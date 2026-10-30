
import java.util.HashSet;

public class HappyNumber {

    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {

            set.add(n);

            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        System.out.println("isHappy(19) = " + isHappy(19));
        System.out.println("isHappy(2) = " + isHappy(2));
        System.out.println("isHappy(7) = " + isHappy(7));
        System.out.println("isHappy(1) = " + isHappy(1));
    }
}
