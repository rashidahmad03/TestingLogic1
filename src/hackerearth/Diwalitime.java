package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diwalitime {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t = br.readLine();
		String v[] = t.split(" ");
		int f[] = new int[v.length];
		int g[] = new int[f[0]];
		for (int i = 0; i < v.length; i++)
			f[1] = Integer.parseInt(v[i]);
		for (int i = f[1]; i < f[0]; i++) {
			g[i] += 1;
			i += f[1];
		}

		for (int j : g)
			System.out.println(j);
	}

}
