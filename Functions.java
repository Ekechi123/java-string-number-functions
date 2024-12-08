import java.lang.*;

public class Functions {

    // Function to return all even numbers from the parameter list
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

    // Function to convert a string to uppercase
    public static String toUpperCase(String input) {
        return input.toUpperCase();  // Using built-in toUpperCase method
    }

    // Function to return the longest string from a list of strings
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
}

