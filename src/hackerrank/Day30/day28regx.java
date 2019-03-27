package hackerrank.Day30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class day28regx {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		ArrayList<String> aa = new ArrayList<String>();
		for (int NItr = 0; NItr < N; NItr++) {
			String[] firstNameEmailID = scanner.nextLine().split(" ");

			String firstName = firstNameEmailID[0];

			String emailID = firstNameEmailID[1];

			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "gmail.com";
			Pattern pat = Pattern.compile(emailRegex);
			if (pat.matcher(emailID).matches())
				aa.add(firstName);

		}
		Collections.sort(aa);
		for (String d : aa)
			System.out.println(d);

		scanner.close();

		// TODO Auto-generated method stub

	}

}
