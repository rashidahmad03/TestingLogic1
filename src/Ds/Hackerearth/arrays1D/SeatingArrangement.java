package Ds.Hackerearth.arrays1D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeatingArrangement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[T];
		for (int i = 0; i < T; i++) {
			arr[i] = Integer.parseInt(br.readLine());

		}
		seat(arr);

	}

	static void seat(int arr[]) {
		System.out.println(arr[0]);
		StringBuffer br = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 6 == 0) {
				br.append(arr[i] + 1 + " WS\n");
				continue;

			}
			if (arr[i] % 6 == 1) {
				br.append(arr[i] - 6 + " WS\n");
				continue;
			}
			if ((arr[i] + 6) % 6 == 2) {
				br.append(arr[i] - 9 + " MS\n");
				continue;

			}
			if ((arr[i] + 6) % 6 == 5) {
				br.append(arr[i] + 9 + " MS\n");
				continue;
			}
			if ((arr[i] + 6) % 6 == 3) {
				br.append(arr[i] - 9 + " AS\n");

			}
			if ((arr[i] + 6) % 6 == 4) {
				br.append(arr[i] + 5 + " AS\n");
			}

		}
		System.out.println(br);

	}

}
