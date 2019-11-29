package amazon;

public class ReverseLink {
	Node head;
	static int Midile = 0;

	public static void main(String[] args) {
		ReverseLink LS = new ReverseLink();

		LS.insert(LS, 55);
		LS.insert(LS, 457);
		LS.insert(LS, 75);
		LS.insert(LS, 41);
		LS.insert(LS, 55545);
		LS.insert(LS, 525);
		LS.printList(LS);
		System.out.println("midle =" + Midile);

	}

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			next = null;
		}

	}

	public ReverseLink insert(ReverseLink list, int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}

	public void printList(ReverseLink list) {
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
			Midile++;
		}
		Midile = (int) Math.round(Midile / 2.0);
		int j = 1;
		currNode = list.head;
		while (j < Midile) {
			currNode = currNode.next;
			j++;
		}
		System.out.println("\nmidle element = " + currNode.data);
	}

}
