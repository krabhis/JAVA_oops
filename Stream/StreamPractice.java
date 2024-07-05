import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {

        // Creating a List and getting a Stream from it
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> myStream = list.stream();

        // Creating an array and getting a Stream from it
        String[] array = {"apple", "banana", "pineapple"};
        Stream<String> myStream1 = Arrays.stream(array);

        // Creating a Stream from specified values
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);

        // Creating an infinite Stream using iterate
        Stream<Integer> iterateStream = Stream.iterate(0, n -> n + 1).limit(100);

        // Creating an infinite Stream using generate
        Stream<Integer> generateStream = Stream.generate(() -> (int) (Math.random() * 100)).limit(50);

        // Use the streams here if needed (e.g., print elements)
        // myStream.forEach(System.out::println);
        // myStream1.forEach(System.out::println);
        // integerStream.forEach(System.out::println);
        // iterateStream.forEach(System.out::println);
        // generateStream.forEach(System.out::println);

        // Corrected part: Collecting filtered elements into a List
        List<Integer> filteredList = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 4, 32, 23)
        .stream()
                                            
        .filter(x -> x % 2 == 0)
                                            
        .collect(Collectors.toList());

        System.out.println(filteredList);


        Stream <Double> str = Stream.iterate(2.0,decimal->decimal>0.1,decimal->decimal/2);

        str.forEach(System.out::println);
        }
}
