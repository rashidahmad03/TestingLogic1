package amazon;

public class Linklistamazon {

	public static void main(String[] args) {
		Linklist lst = new Linklist();

		lst.intsert(5);
		lst.intsert(25);
		lst.intsert(2336);
		lst.printall();

	}

	static class Node {
		Node next;
		int data;

		Node(int d) {
			this.data = d;
			this.next = null;
		}

	}

	static class Linklist {
		Node Head;

		public void intsert(int n) {
			Node an = new Node(n);
			Node current = this.Head;

			if (current == null) {
				current = an;
			}

			else {
				while (current.next != null) {
					current = current.next;
				}
				current.next = an;
			}
			this.Head = current;
		}

		public void printall() {

			Node current = this.Head;

			while (current != null) {
				System.out.println(current.data);
				current = current.next;
			}

		}

	}

}
