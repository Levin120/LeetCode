public class Solution {
    public double pow(double x, int n) {
        if(n == 0) 
            return 1;
        double s = pow(x, n / 2);
        if(n % 2 == 0)
            return s * s;
        else if(n > 0)
            return s * s * x;
        else 
            return s * s / x;
    }
}
