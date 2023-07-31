public class HA5Q2_R {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<= 5-i;j++ ){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
