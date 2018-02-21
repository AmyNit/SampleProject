package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {

	public static void main(String[] args) {

	/*
	 * we don't get any warning msgs if the type of ArrayList is Object.
	 * We can store any kind of data in arrayList
	 */
	
	List<Object> arrayList=new ArrayList<Object>();
	
	arrayList.add(4);
	arrayList.add(4);
	arrayList.add(true);
	arrayList.add(8);
	

	List<Integer> arrayList1=new ArrayList<Integer>();
	
	arrayList1.add(3);
	arrayList1.add(4);
	arrayList1.add(6);
	arrayList1.add(8);
	
	//arrayList.retainAll(arrayList1); //retains only matching data
	

	//System.out.println(	arrayList.size()); // give the size of arrayList. size starts from 1
	
	//System.out.println(arrayList.get(2)); // gives the data at index 2
	
	//System.out.println(arrayList); 
	
	//System.out.println(arrayList.contains(4)); // checks if arrayList contains 4. if yes, it gives true. else, it gives false
	
	System.out.println(arrayList.contains(arrayList1));// checks if all data in arrayList matches arrayList1. if yes, it gives true, else it gives false
	
	
	
	
	
	
	
	
	
	}

}
