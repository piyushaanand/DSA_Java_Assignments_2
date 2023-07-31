public class HA5Q5 {
    public static void main(String[] args) {
        int n=5;
        int a=0;
        int b= 1;
        if(n==1){
            System.out.println(a);
        }else if(n==2){
            System.out.println(b);
        }else
        {
            System.out.println(a);
            System.out.println(b);
            while(n>=3){
                int c = a+b;
                System.out.println(c);
                a=b;
                b=c;
                n--;

            }
        }
    }
}
