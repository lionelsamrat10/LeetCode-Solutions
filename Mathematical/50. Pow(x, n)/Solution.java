class Solution {
    public double myPow(double x, int n) {
        if(n == 1) return x;
        if(n == 0) return 1;
        
        int m = n / 2;
        if(n < 0){
            x = 1 / x;
            m = -m;
        }
        
        double temp = myPow(x, m);
        
        if(n % 2 == 0) return temp * temp;
        else return temp * temp * x;
    }
}
