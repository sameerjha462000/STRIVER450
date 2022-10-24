// https://bit.ly/3JXtGcE
class Solution
{
     long floorSqrt(long x)
	 {
	     double l = (double)1;
	     double h = (double)x;
	     
	     double eps = 1e-6;
	     
	     while(h - l > eps){
	         double mid = l + (h-l)/2;
	         if(mid * mid < (double)x){
	             l = mid;
	         }else{
	             h = mid;
	         }
	     }
	     
	     return (long)Math.floor(h);
	     
	     
	 }
}



// ROUGH WORK






