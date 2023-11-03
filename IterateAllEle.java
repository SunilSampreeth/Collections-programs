package list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class IterateAllEle {
public static void main(String[] args) {
	List<Integer> l = new LinkedList<>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	System.out.println("Getting all elements");
	for(int i:l) {
		System.out.println(i);
	}
	Collections.reverse(l);
	System.out.println("Getting all Reverse elements ");
	for(int i:l) {
		System.out.println(i);
	}
	
}
}
