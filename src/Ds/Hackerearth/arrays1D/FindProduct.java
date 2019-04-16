package Ds.Hackerearth.arrays1D;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class FindProduct {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String br = new String("1");

		for (int i = 0; i < T; i++) {
			// new BigInteger(br.toString()).multiply(new BigInteger("" + sc.nextInt()));
			br = "" + (new BigInteger(br).multiply(new BigInteger("" + sc.nextInt()))
					.mod(new BigInteger("100000000" + 7)));
		}
		System.out.println(br.toString());

	}
}
