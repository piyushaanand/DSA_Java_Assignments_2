public class A5Q7 {
    public static void main(String[] args) {
        System.out.println("Pattern 1 : ");
        char ch = 'E';
        for (char i = 'A'; i <= ch; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern two : ");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("$  ");
            }
            System.out.println();
        }
        System.out.println("Pattern three : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("Pattern four : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern 5 : ");
        for (char i = 'A'; i <= ch; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern 6 : ");
        char k = 'A';
        for (char i = 'A'; i <= ch; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(k + "\t");
                k++;
            }
            System.out.println();

        }
        System.out.println("Pattern:7");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattern 8");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattern 9");
         for(int i=1;i<=n;i++){
             for(int j=1;j<=n-i;j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=2*i-1;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
