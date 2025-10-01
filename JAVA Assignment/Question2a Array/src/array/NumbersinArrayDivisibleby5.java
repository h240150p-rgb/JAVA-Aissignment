package array;



import java.util.ArrayList;
import java.util.List;

public class NumbersinArrayDivisibleby5 {
    public static void main(String[] args) {

        // Creating the Array list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(20);
        numbers.add(30);
        numbers.add(6);

        // Using the stream to filter and print numbers divisible by 5
        numbers.stream()
               .filter(n -> n % 5 == 0)
               .forEach(System.out::println);
    }
}