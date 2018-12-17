package streams_lymbds;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Esier_stream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        for (int number : numbers) {
//            System.out.println(number);
//        }

        Runnable r = () -> System.out.println("hello world");
        System.out.println(r.toString());

        numbers.forEach(System.out::println);
//       int sum = (int a=2, int b=4 ->  a+b);
//        System.out.println(sum);


    }
}




//class myStreamEmployee{
//    private static Employee[] arrayOfEmps = {
//            new Employee("Jeff Bezos", 100000.0),
//            new Employee("Bill Gates", 200000.0),
//            new Employee("Mark Zuckerberg", 300000.0)
//    };
//
//Stream.of(arrayOfEmps);
//}


//class Employee{
//    String fio;
//    double salary;
//}
//class Persons{
//    private final Employee employee;
//}