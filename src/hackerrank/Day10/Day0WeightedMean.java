package hackerrank.Day10;

import java.util.Scanner;

public class Day0WeightedMean {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int T = sc.nextInt();
		int x[] = new int[T];
		int y[] = new int[T];
		for (int i = 0; i < T; i++)
			x[i] = sc.nextInt();
		for (int i = 0; i < T; i++)
			y[i] = sc.nextInt();

		new Day0WeightedMean().Mean(x, y, T);
	}

	private void Mean(int X[], int Y[], int Size) {
		int xi = 0;
		int y = 0;
		for (int i = 0; i < Size; i++) {
			xi += X[i] * Y[i];
			y += Y[i];

		}
		float result = (float) xi / (float) y;
		System.out.printf("%.1f", result);

	}

}
