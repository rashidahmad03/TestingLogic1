package hackerrank.Day10;

import java.util.Arrays;
import java.util.Scanner;

public class Day1Quartiles {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int T = sc.nextInt();
		int x[] = new int[T];
		for (int i = 0; i < T; i++)
			x[i] = sc.nextInt();
		Arrays.sort(x);

		int l = T / 2;

		int low[] = new int[l];
		int up[] = new int[l];

		for (int i = 0; i < T; i++) {
			if (i < l)
				low[i] = x[i];
			else {
				if (i > l) {
					up[i - l - 1] = x[i];
				} else
					up[i - l] = x[i];
			}
		}

		Median(low);
		Median(x);

		Median(up);
	}

	public static void Median(int X[]) {
		int siz = X.length;
		int median = 0;
		if (siz % 2 == 0) {
			int l = siz / 2;
			int R = (siz / 2) - 1;
			median = (X[l] + X[R]) / 2;

		} else {
			int R = (siz / 2);
			median = X[R];

		}
		System.out.println(median);

	}
}
