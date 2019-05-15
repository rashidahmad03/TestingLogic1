package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HelpJarvis {

	public static int length(int number) {
		return (int) (Math.log(number) / Math.log(10)) + 1;
	}

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 1;
		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(br.readLine());
			StringBuffer op = new StringBuffer();

			for (int i = 0; i < n; i++) {
				String num = br.readLine();
				solve(num, op);
			}

			System.out.println(op);
		}
	}

	public static int S(int min, int max) {
		return (max * (max + 1) / 2) - (min * (min + 1) / 2);
	}

	public static void solve(String num, StringBuffer op) {
		int min = Integer.parseInt(num.substring(0, 1));
		int max = min;
		int sum = min;
		HashSet<Integer> hs = new HashSet<>();
		hs.add(min);
		for (int i = 1; i < num.length(); i++) {
			int k = Integer.parseInt(num.substring(i, i + 1));
			hs.add(k);
			sum += k;
			if (k > max)
				max = k;
			else if (k < min)
				min = k;
		}
		if (S(min - 1, max) == sum && hs.size() == num.length()) {
			op.append("YES\n");
		} else
			op.append("NO\n");
	}

}