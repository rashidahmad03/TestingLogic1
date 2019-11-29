package com.quz;

public class MAin {
	private void m1() {
		System.out.println("test main");
	}

	public static void main(String[] args) {
		AAX m = new AAX();
		m.m1();

	}

}

class AAX extends MAin {
	public void m1() {
		System.out.println("AAz");
	}

}
