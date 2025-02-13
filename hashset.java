import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");

        // Checking Existence
        if (fruits.contains("Apple")) {
            System.out.println("Apple is in the HashSet");
        }
    }
}
