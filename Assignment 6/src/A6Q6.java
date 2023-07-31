import java.util.Scanner;
public class A6Q6 {
    public static int count(String s , char a ){
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==a)
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        char ch = 'e' ;
        int res = count(str,ch);
        System.out.println(ch+" occurs "+res+" times in the String "+str);

    }
}
