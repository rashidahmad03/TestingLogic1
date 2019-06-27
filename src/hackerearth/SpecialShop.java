package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SpecialShop {

	public static StringBuffer out_ = new StringBuffer();

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String da = br.readLine();
			String v[] = da.split(" ");
			int N = Integer.parseInt(v[0]);
			int A = Integer.parseInt(v[1]);
			int B = Integer.parseInt(v[2]);
			adds(N, A, B);
		}
		System.out.println(out_);

	}

	public static void adds(int n, int a, int b) {
		Double min = Double.MAX_VALUE;
		// for(int i=0;i<=N;i++)
		// {
		// int da=(A)*(i*i)+B*((N-i)*(N-i));
		// if(min>da)
		// min=da;
		// }

		Double x = (double) ((b * n) / (a + b));

		double c = ((x.intValue()) + 0.5);
		if (x > c)
			x = (double) ((x.intValue()) + 1);
		else
			x = (double) (x.intValue());

		min = (a * x * x + b * (n - x) * (n - x));
		// min=N^2*A*B/(A+B);
		out_.append(min + "\n");

	}
}
