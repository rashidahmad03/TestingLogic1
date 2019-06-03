package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {

	// Complete the birthday function below.
	static int birthday(List<Integer> s, int d, int m) {
		int sum[] = new int[105];
		int count = 0;
		sum[0] = 0;
		for (int i = 0; i < s.size(); i++)
			sum[i + 1] = sum[i] + s.get(i);
		for (int i = 0; i <= s.size() - m; i++) {
			if (sum[i + m] - sum[i] == d) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> s = new ArrayList<Integer>();
		String ss = (bufferedReader.readLine().trim());
		String v[] = ss.split(" ");
		for (int i = 0; i < v.length; i++)
			s.add(Integer.parseInt(v[i]));

		// List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
		// "").split(" ")).map(Integer::parseInt).collect(toList());

		String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int d = Integer.parseInt(dm[0]);

		int m = Integer.parseInt(dm[1]);

		int result = birthday(s, d, m);
		System.out.println(result);
		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedReader.close();
		// bufferedWriter.close();
	}
}
