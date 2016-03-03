package unit13;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public void startTest(){
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Adam");
		hashSet.add("Bob");
		hashSet.add("Lebron");
		hashSet.add("James");
		Iterator<String> iterator = hashSet.iterator(); 
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
