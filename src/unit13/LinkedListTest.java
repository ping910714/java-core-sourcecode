package unit13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
	public void startTest(){
		LinkedList<String> student = new LinkedList<>();
		student.add("Adam");
		student.add("Bob");
		student.add("Jack");
		ListIterator<String> listIterator = student.listIterator();
		listIterator.add("Curry");
		student.addFirst("James");
		System.out.println(student);
		student.removeFirst();
		System.out.println(student.indexOf("James"));
	}
}
