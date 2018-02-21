package collectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {

	/*
	 * can store multiple data types since we haven't specified the type of data
	 * can store duplicate data
	 * maintains insertion order
	 * 
	 */
	List linkedlist=new LinkedList<>(); // or LinkedList linkedlist=new LinkedList<>();
	
	linkedlist.add(20);
	linkedlist.add(20);
	linkedlist.add("hello");
	linkedlist.add(true);
	linkedlist.add(2.3);
	
	System.out.println(linkedlist);
	
	/*
	 * No warning msgs since we  have specified data type as Object
	 */
	
	System.out.println(linkedlist.get(0)); // get the data at index at 0
	
    List<Object> linkedlist1=new LinkedList<>();
	
	linkedlist1.add(20);
	linkedlist1.add(20);
	linkedlist1.add("hello");
	linkedlist1.add(true);
	linkedlist1.add(2.3);
	
	System.out.println(linkedlist1);
	
	
	
	
	
	
	
	}

}
