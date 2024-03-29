package programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 43, 7, 4, 8, 32);

//        printAllNumbersInListFunctional(numbers);
        printEvenNumbersInListFunctional(numbers);
    }

//    private static void print(int number){
//        System.out.println(number);
//    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println); // method reference
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(FP01Functional::isEven) //Filter - Only Allow Even Numbers
                .forEach(System.out::println); // Method Reference
    }
}
