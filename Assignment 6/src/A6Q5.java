import java.util.Scanner;
public class A6Q5 {
    public static double area(int n,double s ){
        return (n*Math.pow(s,2))/4*Math.tan(Math.PI/n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter s : ");
        double s = sc.nextDouble();
        System.out.println("The area of the polygon is : "+area(n,s));
    }
}
