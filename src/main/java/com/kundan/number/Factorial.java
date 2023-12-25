package com.kundan.number;

public class Factorial {
	public static void main(String[] args) {

		int n = 5;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial=" + fact);

		Factorial f = new Factorial();
		int i = f.factInterative(n);
		System.out.println(i);

	}

	int factInterative(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	int factRecur(int n) {
		if (n < 0) {
			return 1;
		} else {
			return n * factRecur(n - 1);
		}
	}

}
