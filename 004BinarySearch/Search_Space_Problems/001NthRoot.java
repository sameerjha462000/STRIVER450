private static double nthRoot(int n, int m){
	// we are required to find the nth root of m
	double low = 0;
	double high = m;

	// Let us say we want the degree of precision to be 5
	double epsilon = 1e-6;

	while(high-low > epsilon){
		double mid = low + (high-low)/2;

		if(multiply(mid, n) < m){
			low = mid;
		}else{
			high = mid;
		}
	}

	return high;
}

private static double multiply(double num, int n){
	double ans = 1;

	for(int j = 1; j <= n;j++){
		ans = ans * num;
	}
	return ans;
}



// ROUGH WORK








