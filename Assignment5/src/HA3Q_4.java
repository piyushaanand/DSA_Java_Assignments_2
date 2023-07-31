public class HA3Q_4 {
    public static void main(String[] args) {
        double a = 0.5;
        double x = a*Math.PI/180;
        double TVS = Math.cos(x);
        int s =1;int i =1;
        double OVS = 1 ; double term = 1;
        do{
            s*=-1;

            OVS= OVS+s*term*x*x/(i*i+1);
            i++;

        }while(Math.abs(TVS-OVS)>0.000001);
        System.out.println("The ans is : " +OVS);

    }
}
