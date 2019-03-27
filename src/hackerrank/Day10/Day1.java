package hackerrank.Day10;

import java.util.Arrays;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();

		}
		Arrays.sort(arr);
		int size = arr.length;
		Mean(arr, size);
		Median(arr, size);
		Mode(arr, size);
		// TODO Auto-generated method stub

	}

	public static void Mean(int X[], int siz) {

		double mean = 0;
		for (int i = 0; i < siz; i++) {
			mean += X[i];

		}
		System.out.println(mean / siz);

	}

	public static void Median(int X[], int siz) {
		double median = 0;
		if (siz % 2 == 0) {
			int l = siz / 2;
			int R = (siz / 2) - 1;
			median = ((double) X[l] + (double) X[R]) / 2;

		} else {
			int R = (siz / 2) + 1;
			median = X[R];

		}
		System.out.println(median);

	}

	public static void Mode(int X[], int siz) {
		int modeCount = 1; // The count of the mode value
		int mode = 0; // The value of the mode

		int currCount = 1;
		int currElement;

		// Iterate through all values in our array and consider it as a possible mode
		for (int candidateMode : X) {
			// Reset the number of times we have seen the current value
			currCount = 1;

			// Iterate through the array counting the number of times we see the current
			// candidate mode
			for (int element : X) {
				// If they match, increment the current count
				if (candidateMode == element) {
					currCount++;
				}
			}

			// We only save this candidate mode, if its count is greater than the current
			// mode
			// we have stored in the "mode" variable
			if (currCount > modeCount) {
				modeCount = currCount;
				mode = candidateMode;

			}
		}
		System.out.println(mode);

	}

}
