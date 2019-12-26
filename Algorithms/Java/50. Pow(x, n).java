class Solution {
    public double myPow(final double x, final int n) {
        double pow = 0;
        double res = 0;

        if (n==0){return 1;}else{
        
        pow = myPow(x, n/2);
        
        if (n%2==-1) res = pow*pow/x;

        if (n%2==0) res = pow*pow;

        if (n%2==1) res = pow*pow*x;}
        return res;

        }
        
    }
