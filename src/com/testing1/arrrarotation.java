package com.testing1;

import java.util.Scanner;

public class arrrarotation {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];
		scanner.nextInt();

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}
		for (int i = 0; i < d; i++)
			a = Rotate(a);

		for (int aa : a)
			System.out.print(aa + " ");
		scanner.close();
	}

	public static int[] Rotate(int x[]) {
		int c = x[0];
		int s = x.length;
		for (int i = 0; i < s - 1; i++) {
			x[i] = x[i + 1];

		}
		x[s - 1] = c;

		return x;
	}
}
