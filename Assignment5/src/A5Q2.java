import java.util.Scanner;
public class A5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int a = sc.nextInt();
        int num=a;
        int rev=0;
        int flag=0;
        for(int i=2;i<=(int)Math.sqrt(a);i++){
            if(a%i==0){
                flag =1;
                break;
            }
        }if(flag!=0) {
            System.out.println(num+" is not a twisted prime number .");
        }else{
            while(num!=0){
                int r = num%10;
                rev = rev*10+r;
                num=num/10;
            }
            System.out.println("Rev. is "+rev);
            flag =0;
            for(int i=2;i<=(int)Math.sqrt(rev);i++){
                if(rev%i==0){
                    flag=1;
                    break;
                }
            }if(flag!=0){
                System.out.println(a+" is not a twisted prime.");
            }else{
                System.out.println(a+" is a twisted prime.");
            }
        }
    }
}
