import java.util.Scanner;
public class HA6Q4 {
    public static int Word(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentance : ");
        String str = sc.nextLine();
        int res = Word(str);
        System.out.println("The number of word in the sentance "+str+" is "+res);
    }
}
