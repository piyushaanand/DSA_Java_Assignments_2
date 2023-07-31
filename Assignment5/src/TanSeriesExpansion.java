import java.util.Scanner;

public class TanSeriesExpansion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x in degrees: ");
        double x = Math.toRadians(input.nextDouble());

        double tanX = 0;
        double term = x;
        double error = 1e-6; // acceptable computation error

        int n = 1; // start with the first term
        while (Math.abs(term) > error) {
            tanX += term;
            term = ((-1) * term * x * x) / ((2 * n - 1) * (2 * n + 1));
            n++;
        }

        System.out.println("tan(" + Math.toDegrees(x) + ") = " + tanX);
    }
}
