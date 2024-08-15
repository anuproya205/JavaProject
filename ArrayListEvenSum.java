import java.util.ArrayList;
import java.util.List;
public class ArrayListEvenSum {
    public static int calculateEvenSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            if (number == null) {
                throw new NullPointerException("Null value found in the list");
            }
            if (number % 2 == 0) {
                sum= sum+ number;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
            // Create an ArrayList of integers
            List<Integer> numbers = new ArrayList<>();
//            inset element into arraylist
            numbers.add(10);
            numbers.add(23);
            numbers.add(44);
            numbers.add(null); // Adding a null value to test the exception
            numbers.add(56);
            numbers.add(91);
            try {
                int sum = calculateEvenSum(numbers);
                System.out.println("Sum of even numbers: " + sum);
            } catch (NullPointerException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }


