import java.lang.*;  // Explicitly importing java.lang package

/**
 * This class contains various utility functions like:
 * 1. Extracting even numbers from an array
 * 2. Converting a string to uppercase
 * 3. Finding the longest string from a list
 * 4. Returning the maximum of two integers
 * 5. Reversing a string
 * 6. Pausing the program for a specified duration
 */
public class Functions {

    /**
     * This function returns all even numbers from the provided array of integers.
     * 
     * @param numbers Array of integers to search for even numbers
     * @return A new array containing only the even numbers from the input array
     */
    public static int[] getEvenNumbers(int[] numbers) {
        int count = 0;
        // Count how many even numbers there are
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        
        // Create a new array to store the even numbers
        int[] evenNumbers = new int[count];
        int index = 0;
        
        // Add even numbers to the new array
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers[index++] = num;
            }
        }
        
        return evenNumbers;
    }

    /**
     * This function converts a given string to uppercase.
     * 
     * @param input The string to be converted to uppercase
     * @return The uppercase version of the input string
     */
    public static String toUpperCase(String input) {
        return input.toUpperCase();  // Using built-in toUpperCase method from java.lang.String
    }

    /**
     * This function returns the longest string from a list of strings.
     * 
     * @param strings Array of strings to evaluate
     * @return The longest string in the provided array
     */
    public static String findLongestString(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        
        String longest = strings[0];
        
        for (String str : strings) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        
        return longest;
    }

    /**
     * This function returns the larger of two integers using Math.max().
     * 
     * @param a First integer
     * @param b Second integer
     * @return The larger of the two integers
     */
    public static int findMax(int a, int b) {
        return Math.max(a, b);  // Using Math.max() from java.lang
    }

    /**
     * This function reverses a given string.
     * 
     * @param input The string to reverse
     * @return The reversed version of the input string
     */
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();  // Using StringBuilder's reverse() method
    }

    /**
     * This function pauses the program for the specified number of seconds.
     * 
     * @param seconds The number of seconds to pause the program
     * @throws InterruptedException If the sleep is interrupted
     */
    public static void sleepForSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);  // Using Thread.sleep() to simulate a pause
    }
}
