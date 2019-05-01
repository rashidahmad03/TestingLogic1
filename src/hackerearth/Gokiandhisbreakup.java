package hackerearth;

import java.util.Scanner;

public class Gokiandhisbreakup {
	public static void main(String... a) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[T + 1];
		for (int i = 0; i < T + 1; i++) {
			arr[i] = sc.nextInt();
		}

		StringBuffer bf = new StringBuffer();
		for (int i = 1; i <= T; i++) {

			if (arr[0] <= arr[i])
				bf.append("YES\n");
			else
				bf.append("NO\n");
		}
		System.out.println(bf);
	}

}
