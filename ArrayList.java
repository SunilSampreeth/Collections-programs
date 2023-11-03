package list;

import java.util.List;

public class ArrayList {
	public static void main(String[] args) {
        System.out.println("ADDING ELEMEMT TO THE LIST");
        List<String> l=new java.util.ArrayList<>();
        l.add("bangalore");
        l.add("managalore");
        l.add("hyderbad");
        l.add("andra");
        l.add("delhi");

        l.add(1,"bombay");

        System.out.println(l);

        System.out.println("accessing element in list");
        System.out.println(l.get(2));
        //System.out.println(l.get("andra"));

        System.out.println("updating list");
        l.set(2,"mumbai");
        System.out.println(l);

        System.out.println("removing object");
        System.out.println(l.remove("bangalore"));//booelan true or false
        System.out.println(l);
        System.out.println(l.remove(1));//igt return whcih object remove it
        System.out.println(l);

        System.out.println("conatins elemnt in list");
        System.out.println(l.contains("bangalore"));
        System.out.println(l.contains("bombay"));
    }

}
