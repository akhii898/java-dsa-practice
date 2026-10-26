
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListRemoveDuplicate{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        ArrayList<Integer> result = new ArrayList<>(set);

        System.out.println(result);
    }
}
