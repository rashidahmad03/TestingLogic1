package Ds;

import java.util.Arrays;

public class jugglinrightrotate {
	public static void rotateRight(int[] inp, int k) {
		int size = inp.length;
		for (int i = 0; i < gcd(size, k); i++) {
			int j = size - i;
			int temp = inp[j - 1];
			while (true) {

				int d = (j - k) % size;
				if (d >= size) {
					d = d - size;
				}
				if (d == i)
					break;

				inp[j - 1] = inp[d - 1];
				j = d;
			}

			inp[j - 1] = temp;
		}
	}

	public static int gcd(int n, int b) {
		if (b == 0)
			return n;

		return gcd(b, n % b);
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3 };
		rotateRight(input, 2);
		System.out.println(Arrays.toString(input));
	}
}
