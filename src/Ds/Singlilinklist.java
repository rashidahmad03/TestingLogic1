package Ds;

import java.util.Scanner;

public class Singlilinklist {
	static Test start, q, temp;
	static Runtime r = Runtime.getRuntime();
	static Scanner sc = new Scanner(System.in);

	public static void main(String... a) {
		System.out.println("create");
		int T = sc.nextInt();
		for (int i = 00; i < T; i++)
			create();
		traverse();
	}

	static void create() {

		System.out.println("enter eno");
		int m = sc.nextInt();
		temp = new Test(m);
		if (start == null)
			start = temp;
		else {
			q = start;
			while (q != null) {
				q = q.t;

			}
			q.t = temp;
		}

	}

	static void traverse() {
		System.out.println("traverse");
		if (start == null)
			System.out.println("empty linkedlist");
		else {
			q = start;
			while (q != null) {
				System.out.println(q + "  " + q.t + ">>>>>>" + q.i);
				q = q.t;
			}
		}
	}

}

class Test {
	static Test t;
	int i;

	Test(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return hashCode() + ">>" + i;
	}

}