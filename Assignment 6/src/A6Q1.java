import java.util.Scanner;
public class A6Q1 {
    public static int simpleAddition(int x,int y){
        return x+y;
    }
    public static int simpleSubtraction(int x,int y){
        return y-x;
    }
    public static int simpleMultiplication(int x,int y){
        return x*y;
    }
    public static double division(int x,int y){
        return y/x;
    }
    public static int  remainder(int x, int y){
        return x%y;
    }
    public static double Squareroot(int x ){
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition , 2.Subtraction , 3.Multiplication , 4.Division , 5.Remainder , 6.squareroot ");
        System.out.print("Enter Your Choice : ");
        int ch = sc.nextInt();
        switch(ch){
            case 1 :
                System.out.print("Enter a : ");
                int a = sc.nextInt();
                System.out.print("Enter b : ");
                int b = sc.nextInt();
                System.out.println(a+" + "+b+" is "+simpleAddition(a,b));break;
            case 2 :
                System.out.print("Enter c : ");
                int c = sc.nextInt();
                System.out.print("Enter d : ");
                int d = sc.nextInt();
                System.out.println(d+" - "+c+" is "+simpleSubtraction(c,d));break;
            case 3 :
                System.out.print("Enter e : ");
                int e = sc.nextInt();
                System.out.print("Enter f : ");
                int f = sc.nextInt();
                System.out.println(e+" * "+f+" is "+simpleMultiplication(e,f));break;
            case 4 :
                System.out.print("Enter g : ");
                int g = sc.nextInt();
                System.out.print("Enter h : ");
                int h = sc.nextInt();
                System.out.println(h+" / "+g+" is "+division(g,h));break;
            case 5 :
                System.out.print("Enter i : ");
                int i = sc.nextInt();
                System.out.print("Enter j : ");
                int j = sc.nextInt();
                System.out.println(i+" % "+j+" is "+remainder(i,j));break;
            case 6 :
                System.out.print("Enter n : ");
                int n = sc.nextInt();
                System.out.println("Squareroot of "+n+" is "+Squareroot(n));break;

            default :
                System.out.println("Wrong Inputs !!");
        }

    }
}
