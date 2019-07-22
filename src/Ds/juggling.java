package Ds;

public class juggling {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int size = arr.length;
		int D = 2;
		for (int i = 0; i < D; i++) {
			int j, last;
			// Stores the last element of array
			last = arr[arr.length - 1];

			for (j = arr.length - 1; j > 0; j--) {
				// Shift element of array by one
				arr[j] = arr[j - 1];
			}
			// Last element of array will be added to the start of array.
			arr[0] = last;
		}
		for (int h : arr)
			System.out.println(h);
	}

	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}
		return gcd(y, x % y);

	}

}
