//Patterns /////////
public class A5Q6 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern one : ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pattern two : ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern three : ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        int k=1;
        System.out.println("Pattern four : ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+"\t");k++;
            }
            System.out.println();
        }
    }
}
