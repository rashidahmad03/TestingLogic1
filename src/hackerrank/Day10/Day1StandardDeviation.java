package hackerrank.Day10;

import java.util.Scanner;

public class Day1StandardDeviation {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int T = sc.nextInt();
		int x[] = new int[T];
		for (int i = 0; i < T; i++)
			x[i] = sc.nextInt();
		new Day1StandardDeviation().distance(x, T);
	}

	private void distance(int arr[], int S) {
		float u = new Day1StandardDeviation().mean(arr, S);
		float ss = 0;
		for (int i = 0; i < S; i++) {
			ss += (arr[i] - u) * (arr[i] - u);

		}
		System.out.println(Math.sqrt(ss / S));
	}

	private float mean(int arr[], int S) {
		float u = 0;
		for (int i = 0; i < S; i++) {
			u += arr[i];
		}
		return (float) u / S;
	}

}
