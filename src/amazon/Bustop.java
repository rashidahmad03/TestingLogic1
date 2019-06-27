package amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bustop {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int n = Integer.parseInt(N);
		String data = br.readLine();
		int arr[] = new int[n];
		String v[] = data.split(" ");
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(v[i]);
		int res[] = bus(arr);
		for (int c : res)
			System.out.print(c + " ");
	}

	public static int[] bus(int[] arr) {
		int output[] = arr;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (((j + 1) % (i + 1)) == 0)
					output[j] -= output[i];

			}

		}
		return output;
	}

}
