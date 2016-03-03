package unit13;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest{
	public void startTest(){
		PriorityQueue<GregorianCalendar> pq = new PriorityQueue<>();
		pq.add(new GregorianCalendar(1991, Calendar.AUGUST, 23));
		pq.add(new GregorianCalendar(1990, Calendar.AUGUST, 9));
		pq.add(new GregorianCalendar(1995, Calendar.AUGUST, 9));
		for(GregorianCalendar date : pq){
			System.out.println(date.get(Calendar.YEAR));
		}
		while(!pq.isEmpty()){
			System.out.println(pq.remove().get(Calendar.YEAR));
		}
	}
	
}
