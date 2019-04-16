package Ds.Hackerearth.arrays1D;

import java.util.Scanner;

public class ToggleString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String T = sc.nextLine();
		StringBuffer bf = new StringBuffer();
		for (int i = 0; i < T.length(); i++) {
			if (T.charAt(i) >= 65 && T.charAt(i) <= 90) {
				bf.append("" + (char) (T.charAt(i) + 32));

			}
			if (T.charAt(i) >= 97 && T.charAt(i) <= 122) {
				bf.append("" + (char) (T.charAt(i) - 32));

			}
		}
		System.out.println(bf);
	}

}
