import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {

    // modify this method
    public static long multiplySquaresOfNumbers(List<Integer> numbers) {
        // your code here
        return numbers.stream().map(num -> num*num).collect(Collectors.reducing(1, Math::multiplyExact)); // IDENTITY TELLS IT TO MULTIPLY AGAINST ONE, SO WE DONT UNINTENTIONALLY AFFECT OUTCOME OF MULTIPLYING ALL NUMBERS IN STREAM
        // REDUCE IS AN AGGRAGATE METHOD, MUST START WITH A NUMBER TO AFFECT
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String val : values) {
            numbers.add(Integer.parseInt(val));
        }

        long val = multiplySquaresOfNumbers(numbers);

        System.out.println(val);

        scanner.close();
    }
}