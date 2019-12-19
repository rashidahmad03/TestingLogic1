package com.testing1;

import java.util.Scanner;

public class seriespower {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int m = s.nextInt();
		String str = s.next();

		int counter = 0;
		String output = "";

		for (int i = 0; i < n;) {
			int j = i;
			int mctr = 0;
			for (int c = 0; c < k && j < n; ++j, ++c) {

				char ch = str.charAt(j);

				if (ch == '1') {
					if (mctr < m) {
						output += "1";
						mctr += 1;
					} else {
						output += "0";
						counter += 1;
					}
				}
				if (ch == '0') {
					output += "0";
				}

			}
			i = j;
		}

		System.out.println(counter + "\n" + output);
		// mat(1, 2);
		decimalserise(1.31);

	}

	// print 1,4,8,16,32,64,256,521
	public static void mat(int n, int x) {

		System.out.println(n);
		if (n >= 1024)
			return;
		else
			mat((int) Math.pow(2, x), ++x);
	}

	public static void decimalserise(double x) {
		if (x >= Double.MAX_VALUE)
			return;
		// else
		// decimalserise(x / 2);

		System.out.println(Math.abs(x));
	}

}
