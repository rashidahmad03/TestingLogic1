package Ds.durga;

public class palridroma {

	public static void main(String[] args) {
		String s = "hello";
		boolean f = true;
		for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {

			System.out.println(s.charAt(i) + " " + s.charAt(j));
			if (s.charAt(i) != s.charAt(j)) {
				f = false;
				break;
			}

		}

		System.out.println(f);

	}

}
