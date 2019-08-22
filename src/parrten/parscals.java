package parrten;

public class parscals {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int h = 1;
			for (int j = 1; j <= n * 2; j++) {
				if (i + j >= n + 1 && (j - i) <= n) {
					System.out.print("*");

				} else
					System.out.print(" ");
				// h = h * (i - j) / j;
			}
			System.out.println();
		}

	}

}
