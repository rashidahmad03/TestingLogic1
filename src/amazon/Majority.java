package amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Majority {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int n = Integer.parseInt(N);
		String data = br.readLine();
		int arr[] = new int[n];
		String v[] = data.split(" ");
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(v[i]);
		int res = bus(arr);
		System.out.println(res);
	}

	public static int bus(int[] arr) {
		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1);
		}
		int element = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (mp.get(arr[i]) != -1) {
				if (max < mp.get(arr[i])) {
					max = mp.get(arr[i]);
					element = arr[i];
				}
				mp.put(arr[i], -1);
			}
		}
		if (max > (arr.length / 2))
			return element;
		else
			return -1;
	}
}
