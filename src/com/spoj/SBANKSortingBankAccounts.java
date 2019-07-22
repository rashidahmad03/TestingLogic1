package com.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class SBANKSortingBankAccounts {

	public static void main(String... a) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		for (int j = 0; j < t; j++) {
			int T = Integer.parseInt(br.readLine().trim());
			TreeMap<String, Integer> hm = new TreeMap<String, Integer>();
			for (int i = 0; i <= T; i++) {
				String ky = br.readLine();
				if (hm.containsKey(ky)) {
					int v = hm.get(ky);
					hm.put(ky, ++v);
				} else
					hm.put(ky, 1);

			}
			for (String s : hm.keySet())
				if (!s.equals(""))
					System.out.println(s + " " + hm.get(s));

		}
	}

}
