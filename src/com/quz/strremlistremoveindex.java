package com.quz;

import java.util.ArrayList;

public class strremlistremoveindex {

	public static void main(String[] args) {
		ArrayList<String> ls = new ArrayList<String>();
		for (int i = 0; i < 10; i++)
			ls.add("test=" + i);
		// System.out.println(ls);
		// System.out.println(ls.remove(20));
		System.out.println(ls);

		ls.stream().filter(i -> 1 < 21).forEach(str -> System.out.print(str));
		System.out.println(ls);
	}

}
