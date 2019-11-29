package Ds;

public class linklistsingle {

	public static void main(String[] args) {
		Linked lst = new Linked();
		lst.insetNode(1);
		lst.insetNode(2);
		lst.insetNode(3);
		lst.insetNode(4);
		lst.insetNode(5);
		lst.removeBegin();
		lst.insetNode(6);
		lst.insetNode(7);
		lst.insetNode(8);
		lst.removeBegin();
		lst.insetNode(9);
		lst.inserBegin(0);
		lst.insetNode(10);
		lst.insetatIndex(15, 3);

		lst.printall();

	}

	public static class Node {
		Node next;

		int Data;

		Node(int data) {

			this.next = null;
			this.Data = data;
		}
	}

	public static class Linked {
		Node Head;

		public void insetNode(int data) {
			Node nod = new Node(data);
			if (Head == null) {
				this.Head = nod;

			} else {
				Node pt = this.Head;
				while (pt.next != null) {
					pt = pt.next;

				}
				pt.next = nod;
			}
		}

		public void insetatIndex(int data, int po) {
			Node nod = new Node(data);
			int c = 1;
			Node pt = this.Head;
			while (c != po) {

				c++;
				if (pt.next == null)
					break;
				pt = pt.next;

			}
			Node las = pt.next;
			nod.next = las;
			pt.next = nod;
		}

		public void inserBegin(int data) {
			Node nod = new Node(data);
			if (Head == null) {
				this.Head = nod;

			} else {

				nod.next = this.Head;
				this.Head = nod;
			}
		}

		public void removeBegin() {

			if (Head.next == null) {
				this.Head = null;

			} else {

				Node ld = this.Head.next;
				this.Head = ld;
			}
		}

		public void removeEnd() {

			Node lnd = this.Head;
			while (lnd.next != null)
				lnd = lnd.next;

		}

		public void printall() {
			Node current = Head;
			System.out.print("linklist : ");
			while (current != null) {
				System.out.print(current.Data + " -> ");
				current = current.next;
			}
			System.out.println();
		}

		public void printallrevers() {
			Node current = Head;
			System.out.print("linklist  reverse: ");
			while (current != null) {
				System.out.print(current.Data + " -> ");
				current = current.next;
			}
			System.out.println();
		}

		public void deletlast() {
			Node nod = Head;
			while (nod.next != null)
				nod = nod.next;
			this.Head = nod;

		}

	}

}
