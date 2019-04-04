package hackerrank.Day10;

import java.util.Arrays;
import java.util.Scanner;

public class Day1Quartiles {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		for (int i = 0; i < n; i++)
			x[i] = sc.nextInt();
		Arrays.sort(x);

		System.out.println(median(x, 0, n / 2 - 1));
		System.out.println(median(x, 0, n - 1));
		if (n % 2 == 0) {
			System.out.println(median(x, n / 2, n - 1));
		} else {
			System.out.println(median(x, n / 2 + 1, n - 1));
		}

		sc.close();
	}

	private static int median(int[] arr, int start, int end) {
		int length = end - start + 1;
		int median = 0;
		if (length % 2 != 0) {
			median = arr[start + length / 2];
		} else {
			median = (arr[start + length / 2 - 1] + arr[start + length / 2]) / 2;
		}
		return median;
	}
}