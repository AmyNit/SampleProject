package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator1 {
	
	/*
	 * Iterator is an interface with 3 methods:hasNext(),next(),remove()
	 * hasNext checks  whether there is any data in the collection of object
	 * next() will return the data and moves pointer to the next element
	 * remove() will remove the data from the collection of object
	 * Iterator will work for ArrayList & Linked list. It won't work for Vector(Enumeration is used instead)
	 * listIterator  has 2 additional methods called hasPrevious(),previous()
	 */
	public static void main(String[] args) {
		
		
		List<Object> arrayList = new ArrayList<>();

		arrayList.add(2);
		arrayList.add("hello");
		arrayList.add(6.89);
		arrayList.add(true);
		arrayList.add(2); 
	
		Iterator<Object> itr=arrayList.iterator();
		
	/*	
		while(itr.hasNext()){
			
			System.out.println(itr.next()); // return data in order from top to bottom
			itr.remove(); // removes all data in arraylist
			}
		
		System.out.println(arrayList);
				}
				
	*/
     	ListIterator<Object> itr1=arrayList.listIterator();
	
	while(itr1.hasNext())
	{
		System.out.println(itr1.next()); // prints data forward 
	}
	
	while(itr1.hasPrevious()){
		
		System.out.println(itr1.previous());// prints data in reverse order
	}}	
	
	
	
	
	
	


}