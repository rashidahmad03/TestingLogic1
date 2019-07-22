package hackerrank;

import java.util.Scanner;

public class CircularArrayRotation {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int D = Integer.parseInt(nd[1]);
		int q = Integer.parseInt(nd[2]);
		int[] arr = new int[n];

		String[] aItems = scanner.nextLine().split(" ");

		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			arr[i] = aItem;
		}
		int size = arr.length;

		for (int i = 0; i < gcd(size, D); i++) {
			int j = size - i;
			int temp = arr[j - 1];
			while (true) {
				int d = (j - D) % size;

				if (d == i)
					break;

				arr[j - 1] = arr[d - 1];
				j = d;
			}

			arr[j - 1] = temp;
		}

		for (int i = 0; i < q; i++) {
			int aItem = scanner.nextInt();
			// System.out.println(arr[aItem]);
		}
		for (int aa : arr)
			System.out.println(aa);
		scanner.close();
	}

	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}
		return gcd(y, x % y);

	}
}
