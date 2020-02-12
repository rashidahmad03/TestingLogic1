package amazon;

public class Stacktest {

	public static void main(String[] args) {
		intStack sl = new intStack(5);
		sl.push(56);
		sl.push(4);
		sl.push(45);
		sl.push(53);
		System.out.println(sl.pop());
		System.out.println(sl.pop());
		System.out.println(sl.pop());
		System.out.println(sl.pop());
		System.out.println(sl.pop());

	}

	static class intStack {
		static int arr[];
		static int top = 0;
		static int max;

		intStack(int s) {
			arr = new int[s + 1];
			max = s;

		}

		public static void push(int x) {
			if (top == max)
				return;
			else {
				arr[top++] = x;
			}

		}

		public static int pop() {
			if (top == 0)
				return -1;
			else {
				return arr[--top];
			}

		}

	}

}
