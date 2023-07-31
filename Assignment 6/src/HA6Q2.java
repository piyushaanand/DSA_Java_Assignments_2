import java.util.Scanner;
public class HA6Q2 {
    public static String getMiddleChar(String str) {
        int len = str.length();
        int mid = len / 2;
        if (len % 2 == 0) {
            return str.substring(mid, mid + 1);
        } else {
            return str.substring(mid, mid + 1);
        }
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        System.out.println(getMiddleChar(str));
    }
}
