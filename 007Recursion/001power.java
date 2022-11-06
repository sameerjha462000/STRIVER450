// problem -- https://leetcode.com/problems/powx-n/
class Solution {
    public double myPow(double x, int n) {
        return pow(x, (long) n);
    }
    
    private static double pow(double x, long n){
        if(n < 0) return 1/(Math.pow(x, -n));
        if(n == 0) return 1;
        if(x == 1) return x;
        
        double rres = pow(x, n/2);
        
        rres = rres * rres;
        
        if(n % 2 == 1) rres = rres * x;
        
        return rres;
    }
}


// ROUGH WORK




