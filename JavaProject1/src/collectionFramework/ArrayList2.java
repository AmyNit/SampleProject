package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {


public static void main(String[] args) {
	
	
	List<Integer> arrayList = new ArrayList<>(); 

	arrayList.add(1);
	arrayList.add(9);

	System.out.println(arrayList);
	
	
	List<Integer> arrayList1 = new ArrayList<Integer>(); 

	arrayList1.add(1);
	arrayList1.add(90);
    
	//arrayList.addAll(arrayList1); //adding all data from arrayList1 to arrayList
	//arrayList1.add(1,600); // adding 600 to index 1 of the arrayList.Index starts from 0
	//arrayList.removeAll(arrayList1); // remove all matching data from arrayList if there is any matching data
	
	arrayList.remove(1); // To remove data from index 1
	System.out.println(arrayList1);
	
	System.out.println(arrayList);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




















}
