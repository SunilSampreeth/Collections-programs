package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	String name;
	int sal;
	public Employee(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee name= " + name + ", sal= " + sal ;
	}
	@Override
	public int compareTo(Employee x) {
		
		return this.sal-x.sal;
	}
	

}
public class HighestSal {
public static void main(String[] args) {
	
	List<Employee > l = new ArrayList<>();
	l.add(new Employee("ram ",2000));
	l.add(new Employee("sanju ",3200));
	l.add(new Employee("madhu ",1000));
	l.add(new Employee("sunil ",2200));
	
	Collections.sort(l);
	System.out.println("Highest salary is ");
		System.out.println(l.get(l.size()-1));
		
	System.out.println("--------------\nLowest salary is ");
		System.out.println(l.get(0));
		
	System.out.println("-----------------\nsalary between 2000 to 4000 ");
	for(Employee e : l) {
		if(e.sal>2000 && e.sal<4000) {
		System.out.println(e);
		
		
		
	}
	}
}
}
