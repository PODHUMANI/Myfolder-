/*Stream API (filter, map, reduce)
filter() */
  import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");

        names.stream()
             .filter(name -> name.startsWith("J"))  
             .forEach(System.out::println);
    }
}
//map()
import java.util.Arrays;
import java.util.List;

public class StreamMapExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
               .map(num -> num * num)  
               .forEach(System.out::println);
    }
}
//reduce()
import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b); 

        System.out.println("Sum: " + sum);
    }
}

