package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {
	private String itemName;
	private double price;
	
	
public Shopping(String itemName, double price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}


public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

//  public String toString() {
//	return "Item Nmae is "+itemName+" price is "+price;
//}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List<Shopping> l = new ArrayList<>();
	Shopping s ;
	for(int i=0; i<2; i++) {
	System.out.println("Enter the Item name ");
	String name= sc.next();
	System.out.println("Emter the price ");
	double price= sc.nextDouble();
	 s = new Shopping(name,price);
	l.add(s);
	}
	for(Shopping a : l) {
		System.out.println("Item name is "+a.getItemName()+" price name"+a.getPrice());
	}
	System.out.println("Remove item name");
	String name1=sc.next();
	if(l.contains(name1)) {
		l.remove(name1);
		System.out.println("removed "+name1+" item");
	}
	else
		System.out.println("not found item name ");

for(Shopping a : l) {
	System.out.println("Item name is "+a.getItemName()+" price name"+a.getPrice());
}
}
}
