package Bitalgo;

public class bitsumandXOR {

	public static void main(String[] args) {
		System.out.println(12 ^ 4);
		System.out.println(countValue(71));
		System.out.println(countValuebit(71));
		String n = "hel";
		n = null;
		System.out.println(-5 >>> 1);

	}

	static int countValue(int n) {
		int c = 0;

		for (int i = 0; i <= n; i++) {
			if ((i + n) == (n ^ i))
				c++;
		}
		return c;
	}

	static int countValuebit(int n) {
		int c = 0;

		while (n != 0) {
			if ((n & 1) == 0)
				c++;
			n = n >> 1;
		}
		return 1 << c;
	}

}
