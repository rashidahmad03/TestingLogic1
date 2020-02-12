package amazon;

public class findiuniqeString {

	public static void main(String[] args) {
		String a = "AAABCSSqwegzbhdfhsdfghaadwf";
		int ar[] = new int[56];
		for (int i = 0; i < a.length(); i++) {
			char t = a.charAt(i);
			if (t >= 'A' && t <= 'Z') {
				ar[t - 65] = ar[t - 65] + 1;

			}
			if (t >= 'a' && t <= 'z') {

				ar[t - 97 + 26] = ar[t - 97 + 26] + 1;

			}
		}
		for (int i = 0; i < 54; i++) {
			if (ar[i] > 0) {

				if ((char) (i + 65) >= 'A' && (char) (i + 65) <= 'Z')
					System.out.println((char) (i + 65) + " =  " + ar[i]);

				if ((char) (i + 97) >= 'a' && (char) (i + 97) <= 'z')
					System.out.println((char) (i + 97) + " =  " + ar[i]);
			}
		}

	}
}
