import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class check_odd_integers {
    public static boolean containsOnlyOdd(List<Integer> list) {
        for (int num : list) {
            if (num % 2 == 0) { // Check if the number is even
                return false; // If an even number is found, return false
            }
        }
        return true; // Return true if all numbers are odd
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Creating a list to store integers
        List<Integer> integerList = new ArrayList<>();

        // Prompt the user to enter a sequence of integers separated by spaces
        System.out.println("Enter a sequence of integers separated by spaces:");

        // Read the entire line of input
        String inputLine = scanner.nextLine();

        // Scanner to parse integers from the input line
        Scanner lineScanner = new Scanner(inputLine);

        // Read integers from the input line and add them to the list
        while (lineScanner.hasNextInt()) {
            int num = lineScanner.nextInt();
            integerList.add(num);
        }

        // Closing the Scanners after use
        scanner.close();
        lineScanner.close();

        // Check if the list contains only odd numbers
        boolean result = containsOnlyOdd(integerList);
        
        // Print the result
        System.out.println("Contains only odd numbers: " + result);
    }
}
