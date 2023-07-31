public class HA5Q1 {
    public static void main(String[] args) {
        int n=5;
        for (int k=1;k<=n;k++){
        for (int i=n;i>=1;i--) {
            if(i==k){
                System.out.print("* ");
            }
            System.out.print(i+" ");
        }
            System.out.println();
        }
    }
}
