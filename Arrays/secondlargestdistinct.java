
import java.util.ArrayList;

public class secondlargestdistinct{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(5);
        list.add(20);
        list.add(8);
        list.add(15);

        Integer largest = null;
        Integer secondLargest = null;

        for (int num : list) {

            if (largest == null || num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            else if (num != largest &&
                     (secondLargest == null || num > secondLargest)) {
                secondLargest = num;
            }
        }

        if (secondLargest == null) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}

