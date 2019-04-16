package Ds.Hackerearth.arrays1D;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int arr[] = new int[T];
		for (int i = 0; i < T; i++) {
			arr[i] = s.nextInt();
		}
		StringBuffer bf = new StringBuffer();

		for (int i = T - 1; i >= 0; i--) {
			bf.append(arr[i] + "\n");
		}

		System.out.println(bf);

	}

}
