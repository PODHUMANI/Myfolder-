import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);

        // Ascending Order
        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers);

        // Descending Order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers);
    }
}
