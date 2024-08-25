import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the string input from the user
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        char[] c=inputString.toCharArray();
        char character = scanner.next().charAt(0);
        
        // Count the occurrences of the character in the string
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (c[i] == character) {
                count++;
            }
        }
        
System.out.println(count);
    }
}
