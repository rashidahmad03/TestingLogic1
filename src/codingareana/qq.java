package codingareana;

import java.util.Scanner;

public class qq {

	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//
//		for (int lk = 0; lk < t; lk++) {
//			int i, j, res = 0;
//			int count = sc.nextInt();
//			int item = sc.nextInt();
//
//			sc.nextLine();
//			String str = sc.nextLine();
//
//			for (i = 0; i < str.length(); i++) {
//				for (j = 0; j < str.length() - i; j++) {
//					int len = j + i;
//					int c = 0;
//					for (int k = j; k <= len; k++) {
//
//						{
//							if ((str.charAt(k) - '0') == item) {
//
//								c++;
//							}
//						}
//					}
//					if (count == c) {
//						res++;
//					}
//
//				}
//			}
//			System.out.println(res);
//		}

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();

		while (T-- != 0) {
			int x, count = 0;
			x = s.nextInt();
			while (x != 0) {
				count = count + (x & 1);
				x >>= 1;
			}
			System.out.println((1 << count) - 1);

		}
	}

}
