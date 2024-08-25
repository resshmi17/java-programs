import java.util.Scanner;

class PalindromeHelper {
    boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

public class breakpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        PalindromeHelper helper = new PalindromeHelper();
        
        if (helper.isPalindrome(str)) {
            String result = breakPalindrome(str);
            System.out.println(result);
        } else {
            System.out.println(str);
        }
        
        sc.close();
    }

    public static String breakPalindrome(String str) {
        if (str.length() == 1) {
            return ""; // No way to make a single character non-palindromic
        }

        char[] chars = str.toCharArray();
        boolean changed = false; // Flag to ensure only one character is changed
        
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != 'a') {
                chars[i] = 'a';
                changed = true; // Mark that a change has been made
                break; // Exit the loop after making one change
            }
        }

        // If no change was made in the loop (i.e., all characters in the first half are 'a')
        if (!changed) {
            chars[chars.length - 1] = 'b'; // Change the last character to 'b'
        }

        return new String(chars);
    }
}


