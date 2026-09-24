import java.util.ArrayList;
import java.util.Collections;

public class Acp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("Before: " + list);

        Collections.swap(list, 0, list.size() - 1);

        System.out.println("After: " + list);
    }
}