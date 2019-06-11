package Samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class optimalpath {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(bf.readLine());
		for (int i = 0; i < T; i++) {

			String da = bf.readLine();
			String v[] = da.split(" ");
			int N = Integer.parseInt(v[0]);
			int k = Integer.parseInt(v[1]);
			String cs = bf.readLine();
			String vd[] = cs.split(" ");
			int arr[] = new int[N];
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(vd[j]);
			}
			comp(arr, k);

		}
	}

	public static void comp(int arr[], int k) {
		for (int s : arr)
			System.out.println(s);

	}

}
/*
 * 1 4 2 5 10 20 15
 * 
 * 
 * 
 */