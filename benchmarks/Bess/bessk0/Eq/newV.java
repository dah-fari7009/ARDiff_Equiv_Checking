package demo.benchmarks.Bess.bessk0.Eq;
public class newV{
    public static double snippet (double x) {
        double y = 0;
        double ans = 0;
        double two = 2.0;//change
        if (x <= two) {//change
            y=x*x/4.0;
            ans=(-Math.log(x/2.0)*bessi0(x))+(-0.57721566+y*(0.42278420 +y*(0.23069756+y*(0.3488590e-1+y*(0.262698e-2 +y*(0.10750e-3+y*0.74e-5))))));
        }
        else {
            y=2.0/x;
            ans=(Math.exp(-x)/Math.sqrt(x))*(1.25331414+y*(-0.7832358e-1 +y*(0.2189568e-1+y*(-0.1062446e-1+y*(0.587872e-2 +y*(-0.251540e-2+(2.0/x)*0.53208e-3))))));//change:
        }
        return ans;
    }
    private static double bessi0(double x) {
        return x;
    }
}