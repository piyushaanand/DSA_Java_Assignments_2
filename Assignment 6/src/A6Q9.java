import java.util.Scanner;
public class A6Q9 {
    public static boolean isPassword(String p){
       int nd =0;
       if(p.length()>=8){
           for(int i=0;i<p.length();i++){
               if(!Character.isLetterOrDigit(p.charAt(i))){
                   return false;
               }
           }
           for(int i=0;i<p.length();i++){
               if(Character.isDigit(p.charAt(i))){
                   nd++;
               }
           }
           if(nd>=2){
               return true ;
           }
       }
        return false;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Password : ");
        String pass = sc.nextLine();
        boolean res = isPassword(pass);
        System.out.println(pass+(res?" is valid  ":" is not valid ")+" Password ");
    }
}
