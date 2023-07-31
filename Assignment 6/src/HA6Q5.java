import java.util.Scanner;
public class HA6Q5 {
    public static boolean areConsecutive(int num1, int num2, int num3) {
        // Check if the difference between any two numbers is 1
        return ((num2 == num1 + 1 && num3 == num2 + 1)||(num3+1==num2&&num2+1==num1));
    }


    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3 = sc.nextInt();
        if(areConsecutive(num1,num2,num3)){
            System.out.println("Check whether the three said numbers are consecutive or not! true");
        } else {
            System.out.println("Check whether the three said numbers are consecutive or not! false");
        }

    }
    }
