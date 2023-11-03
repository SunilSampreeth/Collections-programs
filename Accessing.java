package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Accessing {
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of the list");
		int size = sc.nextInt();

		List<String> l = new ArrayList<>();
		System.out.println("enter " + size + " elements");
		for (int k = 0; k < size; k++) {
			l.add(sc.next());
		}

		System.out.println("printing all ele");
		System.out.println(l);
		System.out.println("----------------------------------------");
		System.out.println("first way using for loop");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

		System.out.println("----------------------------------------");
		System.out.println("2nd way using for each");
		for (String a : l)
			System.out.println(a);
		System.out.println("----------------------------------------");
		System.out.println("3rd way using while");
		int i = 0;
		while (i < l.size()) {
			System.out.println(l.get(i));
			i++;
		}
		System.out.println("----------------------------------------");
		System.out.println("4th way using do-while");
		int j = 0;
		do {
			System.out.println(l.get(j));
			j++;
		} while (j < l.size());

		System.out.println("----------------------------------------");
		System.out.println("5th way using itirator");
		Iterator<String> s = l.iterator();
		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}

}
