package unit13;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
	public void startTest(){
		TreeSet<Item> treeSet = new TreeSet<>(new Comparator<Item>() {
			public int compare(Item arg0, Item arg1){
				return arg0.getName().hashCode() - arg1.getName().hashCode();
			}
		});
		treeSet.add(new Item("Adam", 101));
		treeSet.add(new Item("Bob", 102));
		treeSet.add(new Item("Jack", 103));
		for(Item it : treeSet){
			System.out.println(it.toString());
		}
	}
}

class Item implements Comparable<Item>{
	private String name;
	private int ID;
	
	public Item(String name, int iD) {
		this.name = name;
		this.ID = iD;
	}
	
	public String getName(){
		return this.name;
	}

	@Override
	public int compareTo(Item arg0) {
		// TODO Auto-generated method stub
		return this.ID - arg0.ID;
	}
	
	public String toString(){
		return "Name = " + this.name + ";ID = " + this.ID;
	}
}