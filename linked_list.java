import java.util.LinkedList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("David");
        names.add("Alice");
        names.add("Bob");

        // Using For Loop
        System.out.println("Using For Loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Using Enhanced For Loop
        System.out.println("Using Enhanced For:");
        for (String name : names) {
            System.out.println(name);
        }

        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using forEach Method (Java 8+)
        System.out.println("Using forEach:");
        names.forEach(System.out::println);
    }
}
