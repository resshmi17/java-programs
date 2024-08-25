import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); /
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!isVowel(ch[left])) {
                left++;
                continue;
            }
            if (!isVowel(ch[right])) {
                right--;
                continue;
            }
            
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]); 
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
