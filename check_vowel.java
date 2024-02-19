import java.util.Scanner;

public class check_vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        inputString = inputString.toLowerCase();

        boolean vowelFound = false;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelFound = true;
                break; // Exit the loop early if a vowel is found
            }
        }

        if (vowelFound) {
            System.out.println("The string contains at least one vowel.");
        } else {
            System.out.println("The string does not contain any vowel.");
        }

        scanner.close();
    }
}
