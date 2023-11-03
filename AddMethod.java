package list;

import java.util.ArrayList;
import java.util.List;

public class AddMethod {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		List<Integer> l1=l;
		//add(value/object)
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		System.out.println(l);
		l.add(2,200);
		System.out.println(l);
		// we can add duplicate value
		l.add(10);
		System.out.println(l);
		//update or modified using set(index, value) method
		System.out.println("after updateing");
		l.set(3,500);
		System.out.println(l);
		//searching
		System.out.println("first occurnce "+l.indexOf(10));
		System.out.println("last occurence is "+l.indexOf(500));
		
		//removing
		System.out.println(l);
		System.out.println(l.remove(2));
		System.out.println(l);
		//accessing by using get(index)
		System.out.println(l.get(1));
		
		//contains
		System.out.println("Contains");
		System.out.println(l.contains(300));
		System.out.println(l.contains(20));
		//isEmpty()
		System.out.println("Collection is empty or not");
		System.out.println(l.isEmpty());
		
		//equals(collection);
		System.out.println("equals or not");
		System.out.println(l.equals(l1));
		//hashcode()
		System.out.println(l.hashCode());
		System.out.println("--------------------------");
		int a=0;
		do {
			l.get(a);
			a++;
		}while(a<l.size());
		
		
		
		
	}

}
