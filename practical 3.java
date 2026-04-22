import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter a single letter: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase for case-insensitive comparison
        ch = Character.toLowerCase(ch);

        // Check if alphabet
        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("It is a vowel.");
            } else {
                System.out.println("It is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }

        sc.close();
    }
}
