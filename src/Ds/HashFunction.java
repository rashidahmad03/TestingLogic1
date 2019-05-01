package Ds;

import java.util.Scanner;

public class HashFunction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int fa = sc.nextInt();
		sc.nextLine();
		String f = sc.nextLine();
		System.out.println(f);
		System.out.println(has(fa, f));
	}

	public static int has(int n, String T) {
		char ch[];
		ch = T.toCharArray();
		int i, sum;
		for (sum = 0, i = 0; i < T.length(); i++) {
			sum += ch[i];
		}

		return sum % n;
	}

}
