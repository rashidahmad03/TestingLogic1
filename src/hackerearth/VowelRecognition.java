package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelRecognition {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int k = 0; k < T; k++) {
			String t = br.readLine();
			int cn = 0;
			for (int i = 0; i < t.length(); i++) {
				String v = "";

				for (int j = i; j < t.length(); j++) {

					v += t.charAt(j);

					if (v.contains("a") || v.contains("e") || v.contains("i") || v.contains("o") || v.contains("u")
							|| v.contains("A") || v.contains("E") || v.contains("I") || v.contains("O")
							|| v.contains("U"))
						cn += countcomb(v.toLowerCase());
				}

			}
			System.out.println(cn);

		}
	}

	public static int countcomb(String a) {
		int c = 0;

		for (int i = 0; i < a.length(); i++)
			if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
					|| a.charAt(i) == 'u')
				c++;

		return c;

	}

}
