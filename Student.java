package list;

import java.util.ArrayList;
import java.util.List;

public class Student {
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Strudent [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
public static void main(String[] args) {
	List<Student> l = new ArrayList<>();
	Student s1= new Student(1,"sunil",23);
	Student s2= new Student(2,"pramodh",33);
	Student s3= new Student(2,"madhu",24);
	l.add(s1);
	l.add(s2);
	l.add(s3);
	for(Student a:l) {
		System.out.println();
	}
}


}
