class Solution {
    public double myPow(double x, int n) {
        double pow = 0;
        double res = 0;

        if (n==0){return 1;}
        
        pow = myPow(x, n/2);
        
        if (n%2==-1) res = pow*pow/x;

        if (n%2==0) res = pow*pow;

        if (n%2==1) res = pow*pow*x;

        }
        
    }
