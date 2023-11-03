package list;

import java.util.PriorityQueue;

public class Queue1 {
	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		q.add(10);
		q.offer(20);
		q.add(40);
		System.out.println(q);
		System.out.println(q.poll());
	}

}
