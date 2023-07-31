import java.util.Scanner;
public class A5Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int a = sc.nextInt();
        System.out.print("Enter num2 : ");
        int b = sc.nextInt();
        int num1=a;
        int num2=b;
        int fa =0;
        int fb=0;
        for(int i=1;i<=(a/2);i++){
            if(a%i==0) {
                fa += i;
            }
        }
        for(int i=1;i<=(b/2);i++){
            if(b%i==0) {
                fb += i;
            }
        }
        if(num1==fb && num2==fa){
            System.out.println(num1+" and "+num2+" are amicable numbers .");
        }else{
            System.out.println(num1+" and "+num2+" are not amicable numbers .");
        }
    }
}
