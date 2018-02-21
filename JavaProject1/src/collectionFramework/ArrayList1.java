package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		List arrayList = new ArrayList<>(); //or ArrayList arraylist=new ArrayList<>();

		/*
		 * Any data can be stored in arrayList since we haven't defined the type
		 * of arrayList
		 */
		arrayList.add(2); // add method help to add data.
		arrayList.add("hello");
		arrayList.add(6.89);
		arrayList.add(true);
		arrayList.add(2); // storing duplicate elements in arrayList

		System.out.println(arrayList);
		/*
		 * Storing Integers only
		 */
		List<Integer> arrayList1 = new ArrayList<Integer>(); // can't write int here since int is a data type & in collection we can only work with objects.Integer is a class.

		arrayList1.add(1);
		arrayList1.add(9);

		System.out.println(arrayList1);
/*
 * Storing String data only
 */
		List<String> arrayList2 = new ArrayList<String>();

		arrayList2.add("hello");
		arrayList2.add("hai");

		System.out.println(arrayList2);

	
	
	
	/*
	 * Storing Boolean data only.We can store any data by just changing the type
	 */
			List<Boolean> arrayList3 = new ArrayList<Boolean>();

			arrayList3.add(true);
			arrayList3.add(false);

			System.out.println(arrayList3);

		}	
	
}
	
	
	
	
	
	


