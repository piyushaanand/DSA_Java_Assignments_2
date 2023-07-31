import java.util.Scanner;
public class SetCQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Iterations : ");
        int n= sc.nextInt();
        int sum=0;
        int k=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
