package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BobAnIdiot {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(sc.readLine());
		for (int i = 0; i < T; i++) {
			String a = sc.readLine();
			String arr[] = a.split(" ");
			String AE = sc.readLine();
			String arw[] = AE.split(arr[0]);
			String arw1[] = new String[arw.length];
			for (int j = 0; j < arw.length; j++)
				arw1[i] = arw[i].replaceAll(arr[1], arr[0]);
			for (String x : arw1)
				System.out.print(x + arr[0]);

		}
	}

}
