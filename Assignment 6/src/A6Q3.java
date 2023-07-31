import java.util.Scanner;
public class A6Q3 {
    public static int reverse(int num){
        int rev = 0;
        while(num!=0){
           int  r = num%10;
            rev = rev*10+r;
            num=num/10;
        }
        return rev;
    }
    public static boolean Palindrome(int n){

        if(n!=reverse(n)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean res = Palindrome(n);
        System.out.println("Reverse is "+reverse(n));
        System.out.println(n+(res?" is ":" is not ")+" a palindrome number !!!");
    }
}
