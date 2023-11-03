package list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDQueue {
	  public static void main(String[] args) {
	    Deque<Integer> a = new ArrayDeque<Integer>();
	    a.addFirst(10);
	    a.addLast(20);
	    a.add(30);
	    a.add(40);
	    a.add(50);
	    a.offerFirst(60);
	    a.offer(70);
	    a.offerLast(80);
	    System.out.println("elements of a Deque:");
	    System.out.println(a);
	    System.out.println("elements of a Deque after using element method:");
	    System.out.println(a.element());
	    System.out.println(a);
	    System.out.println("elements of a Deque after using peek first method:");
	    System.out.println(a.peekFirst());
	    System.out.println(a);
	    System.out.println("elements of a Deque after using peek last method:");
	    System.out.println(a.peekLast());
	    System.out.println(a);
	    System.out.println("elements of a Deque after using poll first method:");
	    System.out.println(a.pollFirst());
	    System.out.println(a);
	    System.out.println("elements of a Deque after using poll last method:");
	    System.out.println(a.pollLast());
	    System.out.println(a);
	    System.out.println("elements of a Deque after using remove first method:");
	    System.out.println(a.removeFirst());
	    System.out.println(a);
	     System.out.println("elements of a Deque after using remove last method:");
	    System.out.println(a.removeLast());
	    System.out.println(a);

	    System.out.println("iterating using iterator interface");
	    Iterator<Integer> i = a.iterator();
	    while (i.hasNext()) {
	      System.out.println(i.next());
	    }
	    System.out.println("Iterating using for each loop");
	    for (Integer j : a) {
	      System.out.println(j);
	    }
	  }
	}
