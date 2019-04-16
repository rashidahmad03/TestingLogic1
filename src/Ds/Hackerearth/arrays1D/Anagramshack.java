package Ds.Hackerearth.arrays1D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagramshack {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {

			String a = br.readLine();
			String b = br.readLine();
			mat(a, b);
		}
	}

	static void mat(String a, String b) {
		int d = 0;
		StringBuffer br1 = new StringBuffer(a);
		StringBuffer br2 = new StringBuffer(b);
		for (int i = 0; i < br1.length(); i++) {

			for (int j = 0; j < br2.length(); j++) {
				if (br1.charAt(i) == br2.charAt(j)) {

					br1.deleteCharAt(i);
					br2.deleteCharAt(j);
					i--;
					j--;
					break;
				}
			}

		}

		System.out.println(br1.length() + br2.length());
	}

}
