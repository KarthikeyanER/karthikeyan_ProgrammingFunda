package com.gradedproject.q1;

class PowerOfANumber {
	int nPowerOfX(int X, int N) {

		if (N < 1) {
			return 1;
		}

		return X * nPowerOfX(X, N - 1);
	}

}
