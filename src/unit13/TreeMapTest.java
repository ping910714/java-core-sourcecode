package unit13;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapTest {
	public void startTest(){
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(303, "303");
		treeMap.put(103, "103");
		treeMap.put(803, "803");
		for(Entry<Integer, String> entry : treeMap.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
