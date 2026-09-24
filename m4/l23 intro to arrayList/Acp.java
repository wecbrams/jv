import java.util.ArrayList;

public class Acp{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);

        fruits.remove("Banana");

        System.out.println("After removal: " + fruits);
    }
}