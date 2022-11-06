// problem -- https://leetcode.com/problems/count-good-numbers/
class Solution {
    private static long mod = 1000000007;
    public int countGoodNumbers(long n) {
        long first = (n % 2 == 0) ? (n / 2) : ((n/2) + 1);
        long second = n/2;
        
        long mul1 = fastPow(5, first) % mod;
        long mul2 = fastPow(4, second) % mod;
        
        return (int)((mul1 * mul2) % mod);
    }
    
    private static long fastPow(int x, long n){
        if(n == 0) return (long)1;
        if(n == 1) return (long)x;
        
        long rres = fastPow(x, n/2) % mod;
        
        rres = (rres * rres) % mod;
        
        if(n % 2 == 1) rres = (rres * x) % mod;
        
        return rres;
        
    }
}



// ROUGH WORK





