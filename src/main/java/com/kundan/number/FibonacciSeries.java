package com.kundan.number;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum = 0;
		System.out.println(n1);
		System.out.println(n2);

		for (int i = 2; i <= 10; i++) {
			sum = n1 + n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;
		}

		for (int i = 0; i <=10; i++) {
			System.out.println(fab(i) + " ");
		}

	}

	static int fab(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fab(n - 1) + fab(n - 2);
		}

	}

}
