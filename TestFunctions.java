import java.lang.*;  // Explicitly importing java.lang package

public class TestFunctions {

    /**
     * Main method to test the functionality of the Functions class.
     * It tests:
     * 1. getEvenNumbers()
     * 2. toUpperCase()
     * 3. findLongestString()
     * 4. findMax()
     * 5. reverseString()
     * 6. sleepForSeconds()
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Test for getEvenNumbers function
        int[] numbers = {1, 2, 3, 4, 5, 6};  // Input array with both even and odd numbers
        int[] evenNumbers = Functions.getEvenNumbers(numbers);  // Call to getEvenNumbers method
        
        // Print the even numbers from the array
        System.out.print("Even numbers: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");  // Expected Output: 2 4 6
        }
        System.out.println();  // Print a newline for separation

        // Test for toUpperCase function
        String input = "hello world";  // Input string in lowercase
        String upperCaseString = Functions.toUpperCase(input);  // Call to toUpperCase method
        
        // Print the result after converting to uppercase
        System.out.println("Uppercase string: " + upperCaseString);  // Expected Output: "HELLO WORLD"

        // Test for findLongestString function
        String[] strings = {"apple", "banana", "cherry", "date"};  // Array of strings of different lengths
        String longestString = Functions.findLongestString(strings);  // Call to findLongestString method
        
        // Print the longest string in the array
        System.out.println("Longest string: " + longestString);  // Expected Output: "banana"

        // Test for findMax function (using Math.max from java.lang)
        int a = 10, b = 20;  // Two integer values to compare
        int maxNumber = Functions.findMax(a, b);  // Call to findMax method to get the larger number
        
        // Print the maximum value between the two numbers
        System.out.println("Maximum of " + a + " and " + b + " is: " + maxNumber);  // Expected Output: "Maximum of 10 and 20 is: 20"

        // Test for reverseString function (using StringBuilder from java.lang)
        String reversedString = Functions.reverseString("hello");  // Input string "hello"
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);  // Expected Output: "olleh"

        // Test for sleepForSeconds function (using Thread.sleep from java.lang)
        System.out.println("Sleeping for 2 seconds...");  // Print a message before sleep
        try {
            Functions.sleepForSeconds(2);  // Pause the program for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();  // Handle any interruption exception
        }
        System.out.println("Awoke from sleep!");  // Print a message after waking up from sleep
    }
}

