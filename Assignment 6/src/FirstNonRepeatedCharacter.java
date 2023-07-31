import java.util.Scanner;
public class FirstNonRepeatedCharacter {

    public static char findFirstNonRepeatedChar(String str) {
        char result = ' ';
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (count[ch] == 1) {
                result = ch;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        char firstNonRepeatedChar = findFirstNonRepeatedChar(str);
        System.out.println("The first non-repeated character in the string " + str + " is " + firstNonRepeatedChar);
    }
}

