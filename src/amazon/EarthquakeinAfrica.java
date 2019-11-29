package amazon;

import java.util.Scanner;

public class EarthquakeinAfrica {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] affcity = new int[k];
		int[] disval = new int[100];
		for (int i = 0; i < k; i++) {
			affcity[i] = sc.nextInt();
		}
		int j = 0;
		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int l = sc.nextInt();

			if (k == 1) {
				if (v == affcity[j] && u == affcity[j] - 1) {
					disval[j] = l;
				}
			} else {
				for (int inc = 0; inc < affcity.length; inc++) {
					if (u == affcity[inc] - 1 && v == affcity[inc]) {
						disval[j] = l;
					}
				}
				j++;
			}
		} // df
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if (disval[i] != 0) {
				sum += disval[i];
			}
		}
		System.out.println(2 * sum);
	}
}
