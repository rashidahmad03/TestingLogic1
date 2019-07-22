package hackerearth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class BookExercises {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		ArrayList<book> al = new ArrayList<book>();
		int t = sc.nextInt();
		Stack<String> stk = new Stack<String>();
		HashMap<String, Integer> hm = new HashMap();
		int cc = 0;
		for (int j = 0; j < t; j++) {

			int ex = sc.nextInt();
			if (ex != -1) {
				String vd = sc.nextLine();

				al.add(new book(ex, vd));

			} else {
				cc++;
			}

		}
		// System.out.println(stk);
		// System.out.println(hm);
		Comparator<book> cm1 = Comparator.comparing(book::getNum);
		Collections.sort(al, cm1);
		for (int i = 0; i < cc; i++)
			stk.push(al.get(i).name);
		for (int i = stk.size() - 1; i >= 0; i--)
			System.out.println(i + " " + stk.pop());

	}

	static class book {
		int num;
		String name;

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "book [num=" + num + ", name=" + name + "]";
		}

		public book(int num, String name) {

			this.num = num;
			this.name = name;
		}

	}

}
