import java.util.ArrayList;

public class MoveAllZerosArrayList  {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(0);
        list.add(3);
        list.add(12);

        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                list.set(index, list.get(i));
                index++;
            }
        }

        // Fill remaining positions with zeros
        while (index < list.size()) {
            list.set(index, 0);
            index++;
        }

        System.out.println(list);
    }
}
