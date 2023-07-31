public class A5Q4 {
    public static void main(String[] args) {
        int m = 5;
        int n = 9;
        for(int i=m;i<=n;i++){
            int fac =1;
            for(int j=1;j<=i;j++){
                fac *=j;
            }
            System.out.println("Factorial of "+i+" = "+fac);
        }
    }
}
