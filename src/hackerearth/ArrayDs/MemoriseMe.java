package hackerearth.ArrayDs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemoriseMe {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		int c = Integer.parseInt(br.readLine());
		String test[] = new String[c];
		for (int i = 0; i < c; i++) {
			test[i] = " " + br.readLine() + " ";
		}
		match(input, test);

	}

	public static void match(String d, String[] tes) {
		StringBuffer bf = new StringBuffer();
		for (String c : tes) {
//			if (d.indexOf(c) > 0) {
//				bf.append(" ");
//				System.out.println(d.indexOf(c));
			int f = 0;
			if (d.indexOf(c) > 0) {
				int sss = d.indexOf(c) + 1;
				f++;
				// System.out.println(sss);
				// System.out.println(d.indexOf(c, ++sss));
				while (d.indexOf(c, sss) > 0) {
					f++;
					sss = d.indexOf(c, ++sss);
				}
			}
			System.out.println(f);

		}

	}

}
