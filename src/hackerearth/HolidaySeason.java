package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HolidaySeason {
	public static void main(String... aaaaaaaa) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String T = br.readLine();
		int t = Integer.parseInt(T);
		// for (int kl = 0; kl < t; kl++) {
		String name = br.readLine();
		String str, strIn;
		int index;
		int count = 0;
		int l = name.length();
		for (int i = 0; i < l; i++) {
			char ch = name.charAt(i);
			str = ch + "";
			index = name.indexOf(str, i + 1);
			for (int j = i + 1; j < index; j++) {
				strIn = name.charAt(j) + "";
				int k = index;
				while (k < l) {
					if (name.indexOf(strIn, k) != -1) {
						count++;
						k = name.indexOf(strIn, k) + 1;
					} else if (name.indexOf(strIn, k) == -1) {
						k = l;
					}

				}
			}
		}
		System.out.println(count);
	}
//	}
}
