package com.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Halfofthehalf {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer bf = new StringBuffer();
		int t = Integer.parseInt(br.readLine());
		for (int j = 0; j < t; j++) {
			String s = br.readLine();
			String c = s.substring(0, s.length() / 2);
			for (int i = 0; i < c.length(); i += 2) {
				bf.append(c.charAt(i) + "");
			}
			bf.append("\n");

		}
		System.out.println(bf);
	}

}
