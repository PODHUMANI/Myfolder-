import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the list!");
        } else {
            System.out.println("Banana is not found!");
        }
    }
}
