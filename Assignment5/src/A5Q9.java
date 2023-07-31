import java.util.Scanner;
public class A5Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int n = sc.nextInt();
        double sum=0;
        for (int i=1;i<=n;i++){
            sum+=1.0/(Math.pow(i,2));
        }
        System.out.println("The sum 0f the series : "+sum);
    }
}
