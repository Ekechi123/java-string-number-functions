import java.lang.*;

public class TestFunctions {

    public static void main(String[] args) {
        // Test for getEvenNumbers function
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] evenNumbers = Functions.getEvenNumbers(numbers);
        System.out.print("Even numbers: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();  // Print a newline

        // Test for toUpperCase function
        String input = "hello world";
        String upperCaseString = Functions.toUpperCase(input);
        System.out.println("Uppercase string: " + upperCaseString);

        // Test for findLongestString function
        String[] strings = {"apple", "banana", "cherry", "date"};
        String longestString = Functions.findLongestString(strings);
        System.out.println("Longest string: " + longestString);
    }
}
