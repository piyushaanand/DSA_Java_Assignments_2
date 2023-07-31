import java.util.Scanner;
    public class A5Q3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter num1 : ");
            int a = sc.nextInt();
            System.out.print("Enter num2 : ");
            int b = sc.nextInt();
            int sum =0;
            for (int i = a; i <= b; i++) {
                int flag=0;
                for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = 1;
                        break;

                    }

                }if(flag==0){
                    System.out.println(i);
                }

            }
        }
}