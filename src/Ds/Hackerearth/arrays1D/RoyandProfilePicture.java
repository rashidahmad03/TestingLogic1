package Ds.Hackerearth.arrays1D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RoyandProfilePicture {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int T = sc.nextInt();
		StringBuffer bf = new StringBuffer();
		for (int i = 0; i < T; i++) {

			int W = sc.nextInt();
			int L = sc.nextInt();
			if (W >= H && L >= H) {
				if (W == L) {
					bf.append("ACCEPTED\n");
				} else
					bf.append("CROP IT\n");
			} else if (W < H || L < H) {
				bf.append("UPLOAD ANOTHER\n");
			}

		}
		System.out.println(bf);

	}

}

class TestClass {
	public static void main(String args[]) throws Exception {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			StringBuffer bf = new StringBuffer();
			int L = Integer.parseInt(line);
			line = br.readLine();
			int N = Integer.parseInt(line);
			int X[][] = new int[N][2];
			for (int i = 0; i < N; i++) {
				String input = br.readLine();
				String[] tokens = input.split(" ");
				X[i][0] = Integer.parseInt(tokens[0]);
				X[i][1] = Integer.parseInt(tokens[1]);
			}
			for (int i = 0; i < N; i++) {
				if (X[i][0] < L || X[i][1] < L) {
					bf.append("UPLOAD ANOTHER\n");
				} else if (X[i][0] >= L && X[i][1] >= L) {
					if (X[i][0] == X[i][1])
						bf.append("ACCEPTED\n");
					else
						bf.append("CROP IT\n");
				}
			}
			System.out.println(bf);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
