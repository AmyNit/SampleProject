package collectionFramework;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist3 {

	public static void main(String[] args) {

		List<String> linkedlist = new LinkedList<String>(); //LinkedList<String> linkedlist = new LinkedList<String>();

		linkedlist.add("hello");
		linkedlist.add("hai");
		linkedlist.add("how");
		linkedlist.add("are");
		linkedlist.add("you");

		System.out.println(linkedlist);

		linkedlist.clear(); // clears all data from the linked list. same is
							// applicable to array list

		System.out.println(linkedlist);

		System.out.println(linkedlist.isEmpty()); // checks if linked list is empty. Same rule is applicable to linked list

	}

}
