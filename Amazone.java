package list;

import java.util.LinkedList;
import java.util.List;

public class Amazone {
	String product;
	int id;
	
	Amazone(String product,int id){
		this.id=id;
		this.product=product;
	}
	public String toString() {
		return "product ID "+id+ " Product Name "+product;
	}
public static void main(String[] args) {
	List<Amazone> l = new LinkedList<>();
	Amazone a1= new Amazone("Mobile", 11);
	Amazone a2= new Amazone("cloths", 12);
	l.add(a1);
	l.add(a2);
	System.out.println("Accessing ");
	for(Amazone a :l) {
		System.out.println(a);
	}
	System.out.println("");
	l.removeAll(l);
	System.out.println(l);
}
}
