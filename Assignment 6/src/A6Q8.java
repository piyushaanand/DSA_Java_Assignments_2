import java.util.Scanner;
public class A6Q8 {
    public static  boolean isPalindrome(String str ){
        int left =0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
                left++ ;
                right --;
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        boolean res = isPalindrome(s);
        System.out.println(s+(res?" is ":" is not ")+" a palindrome !!!");
    }
}
