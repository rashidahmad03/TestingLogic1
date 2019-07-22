package com.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SLSLCONGHAISOLON {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer bf = new StringBuffer();
		String vd = br.readLine();
		String a[] = vd.split(" ");
		System.out.println(Integer.parseInt(a[0]) + Integer.parseInt(a[1]));

	}

}
