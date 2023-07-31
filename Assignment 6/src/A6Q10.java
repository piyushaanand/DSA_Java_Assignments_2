public class A6Q10 {
       public static double area(int b,int h){
           return 1.0*b*h/2;
       }
       public static double area(double s){
           return s*s;
       }
       public static double area(int r){
           return Math.PI*Math.pow(r,2);
       }
       public static double area(double l, double b){
           return l*b;
       }
    public static void main(String[] args) {
        System.out.println("Area of triangle is "+area(5,10));
        System.out.println("Area of Square is "+area(6.10));
        System.out.println("Area of Circle is "+area(5));
        System.out.println("Area of rectangle is "+area(2.3,2.5));
    }
}
