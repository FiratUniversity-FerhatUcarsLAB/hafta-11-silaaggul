public class Exercise4_6_Multadd {

     // a * b + c işlemini yapan metot
    public static double multadd(double a, double b, double c) {
          return a * b + c;
    }
    
    // x*e^-x + (1 - e^-x) işlemini yapan metot
    public static double expSum(double x) {
         return x * Math.exp(-x) + (1 - Math.exp(-x));
    }

    public static void main(String[] args) {
         // 1) multadd basit test
        System.out.println("multadd(2, 3, 4) = " + multadd(2, 3, 4));
        // 2*3 + 4 = 10

        // 2) sin(π/4) + cos(π/4)/2 ifadesi
        double pi = Math.PI;
        double sinCosResult = multadd(Math.cos(pi/4), 0.5, Math.sin(pi/4));
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + sinCosResult);

        // 3) log 10 + log 20
        double logResult = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("log 10 + log 20 = " + logResult);

        // 4) expSum test
        double x = 2.0;
        System.out.println("expSum(2.0) = " + expSum(x));
    }
}
