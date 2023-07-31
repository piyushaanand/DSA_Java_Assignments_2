public class HA5Q3 {
    public static void sinSeries(double a){
        double x =a* Math.PI/180;
      double TVS = Math.sin(x);
      int s = 1,i=1,deno =1;
      double OVS =x, term = x;
      do{
          s*=-1;
          deno *= (2 * i) * (2 * i + 1);
          term = term*x*x;
          OVS = OVS + s*term/deno ;
          i++;

      }while(Math.abs(TVS-OVS)>=0.000001);
        System.out.println("The value of Required sin series is : "+OVS);
    }

    public static void main(String[] args) {
        sinSeries(0.5);
    }
}
