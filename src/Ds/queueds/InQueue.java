package Ds.queueds;

public class InQueue {

	public static void main(String[] args) throws Exception {
		Myqueue que = new Myqueue(534);
		que.enqueue(526);
		que.enqueue(2536);
		// que.enqueue(2536);
		System.out.println(que.dequeque());
		System.out.println(que.dequeque());
		System.out.println(que.dequeque());
	}

}

class Myqueue {
	int arr[];
	int mx;
	int head;
	int tail;

	public Myqueue(int s) {
		arr = new int[s];
		mx = s;
		head = -1;
		tail = -1;

	}

	public void enqueue(int x) throws Exception {
		if (tail == mx - 1) {
			throw new Exception("full");

		}
		tail++;
		arr[tail] = x;

	}

	public int dequeque() throws Exception {
		if (head == mx - 1)
			throw new Exception("full");
		if (tail == head)
			throw new Exception("empty");
		head++;
		return arr[head];

	}

}