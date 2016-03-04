package unit13;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public void startTest(){
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("1101", "Adam");
		hashMap.put("1005", "Bob");
		hashMap.put("103", "Jack");
		Set<Entry<String,String>> entrys = hashMap.entrySet();
		for(Entry<String, String> entry : entrys){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println(hashMap.getOrDefault("104", "haha"));
	}
}
