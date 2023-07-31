import java.util.Scanner;
public class hA6Q_4 {
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the sentence : ");
        String str = sc.nextLine();
        System.out.println(countWords(str));
    }
}
