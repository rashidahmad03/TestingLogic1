package com.quz;

public class MAin {
	private void m1() {
		System.out.println("test main");
	}

	public static void main(String[] args) {
		for(int i=0;i<100;i++)
			System.out.println("Sorry");

	}

}

class AAX extends MAin {
	public void m1() {
		System.out.println("AAz");
	}

}
