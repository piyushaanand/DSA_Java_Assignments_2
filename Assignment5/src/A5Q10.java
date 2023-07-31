import java.util.Scanner;
public class A5Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int a=0;
        int b=1,c=1;
        System.out.print(a+" "+b+" "+c+" ");
        for(int i=4;i<=n;i++){
            int x=a+b+c;
            System.out.print(x+" ");
            a=b;
            b=c;
            c=x;


        }

    }
}
