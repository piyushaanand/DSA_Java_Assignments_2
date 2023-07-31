import java.util.Scanner;
public class HA6Q3 {
    public static String Midchar(String str){
        if(str.length()/2==0){
            return str.substring(str.length()/2,(str.length())/2+1);
            }else{
            return str.substring(str.length()/2,(str.length()/2)+1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        String res = Midchar(s);
        System.out.println("The middle char is String "+s+" is "+res);
    }
}
