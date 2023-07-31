public class A6Q4 {
    public static int numberOfDays(int y){
        if((y%4==0&&y%100!=0)||(y%400==0)){
            return 366;
        }
        return 365;
    }
    public static void main(String[] args) {
        for(int i=2000;i<=2020;i++){
            System.out.println("Number of Days in Year "+i+" is "+numberOfDays(i));
        }

    }
}
