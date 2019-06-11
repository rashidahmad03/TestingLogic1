package Samsung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class biteevenarray {
	public static int sum = 0;

	public static void main(String... a) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(bf.readLine());
		for (int i = 0; i < T; i++) {
			int size = Integer.valueOf(bf.readLine());
			String da = bf.readLine();
			String v[] = da.split(" ");
			int arr[] = new int[size];
			for (int j = 0; j < size; j++) {
				arr[j] = Integer.parseInt(v[j]);
			}
			sum(arr);
			System.out.println(sum);

		}

	}

	public static void sum(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				dac(arr[i - 1]);
			else
				sum += arr[i];

		}
	}

	public static void dac(int a) {
		if (a % 8 == 0)
			sum += a;
		else {
			int d = a / 8;
			sum += (8 * (d + 1));
		}

	}

}

/*
 * 
 * 1 8 1 5 -1 25 -1 7 35 -1
 * 
 */
