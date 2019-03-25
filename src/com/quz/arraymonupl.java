package com.quz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class arraymonupl {

	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {
		long aa[][] = new long[queries.length][n];
		for (int i = 0; i < queries.length; i++) {

			for (int k = 0; k < n; k++) {

				if (queries[i][0] - 1 <= k && queries[i][1] > k) {

					aa[i][k] = queries[i][2];

				}
				if (i > 0)
					aa[i][k] = aa[i - 1][k] + aa[i][k];

			}
		}

		/*
		 * for(int i=0;i<aa.length;i++){ for(int j=0;j<n;j++) {
		 * 
		 * 
		 * System.out.print(aa[i][j]+" "); } System.out.println(); }
		 */
		long max = aa[queries.length - 1][0];
		for (int i = 1; i < n; i++) {
			if (aa[queries.length - 1][i] > max) {
				max = aa[queries.length - 1][i];
			}
		}
		return max;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\output.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

		String[] nm = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nm[0]);

		int m = Integer.parseInt(nm[1]);

		int[][] queries = new int[m][3];

		for (int i = 0; i < m; i++) {
			String[] queriesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 3; j++) {
				int queriesItem = Integer.parseInt(queriesRowItems[j]);
				queries[i][j] = queriesItem;
				System.err.print(queries[i][j] + " ");
			}
			System.out.println();
		}

		long result = arrayManipulation(n, queries);

		System.out.println(result + "***************");

		scanner.close();
	}
}
